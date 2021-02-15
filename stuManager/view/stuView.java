package Second.Demo02.stuManager.view;

import Second.Demo02.stuManager.global.MyUtils;
import Second.Demo02.stuManager.global.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class stuView {
    private stuView(){}
    public static int showWelcomePage() {
        System.out.println("* ****************************** *");
        System.out.println("* Welcome to use Student Manager");
        System.out.println("* 1 - show student info");
        System.out.println("* 2 - add student info");
        System.out.println("* 3 - update student info");
        System.out.println("* 4 - delete student info");
        System.out.println("* 0 - exit system");
        System.out.println("* ****************************** *");

        int a;
        do {
            System.out.println("Please input right number：");
            a = new Scanner(System.in).nextInt();
        }while (a > 4 || a < 0);

        return a;
    }

    public static void showStuList(ArrayList<Student> stuList) {
        System.out.println("┌───┬─────────────┬──────┬──────┐");
        System.out.printf("│%-3s│%-13s│%-6s│%-6s│\n", "ID","name", "sex", "age");
        for (Student stu : stuList){
            System.out.println("├───┼─────────────┼──────┼──────┤");
            System.out.printf("│%-3d│%-13s│%-6s│%-6s│\n", stu.getId(),stu.getName(), stu.getSex(),stu.getAge());
        }
        System.out.println("└───┴─────────────┴──────┴──────┘");
    }

    public static int getEditStuID() {
        System.out.println("Please input student's id for you want to update: ");
        return new Scanner(System.in).nextInt();
    }

    public static void errorPage(String info) {
        System.out.println("Error with student:" + info);
    }

    public static Student editStuInfo(Student editStu) {
        System.out.print("Please input student's name : ("+editStu.getName()+")");
        String name = new Scanner(System.in).nextLine();
        System.out.print("Please input student's sex : ("+editStu.getSex()+")");
        String sex = new Scanner(System.in).nextLine();
        System.out.print("Please input student's age : ("+editStu.getAge()+")");
        int age = new Scanner(System.in).nextInt();

        return new Student(editStu.getId(), name, sex, age);
    }

    public static int showPoorWelcome() {
        System.out.println("* ****************************** *");
        System.out.println("* Welcome to use Student Manager");
        System.out.println("* 1 - show student info");
        System.out.println("* 0 - exit system");
        System.out.println("* ****************************** *");

        int a;
        do{
            System.out.println("Please input right number :");
            a = new Scanner(System.in).nextInt();
        }while(a < 0 || a > 1);
        return a;
    }

    public static Student getStudentInfo() {
        Student stu = null;
        System.out.println("Please input student's name : ");
        String studentName = new Scanner(System.in).nextLine();
        if (studentName.equals("exit"))
            return stu;
        System.out.println("Please input student's sex : ");
        String studentSex =  new Scanner(System.in).nextLine();
        System.out.println("Please input student's age");
        int age = new Scanner(System.in).nextInt();

        return new Student(MyUtils.stu_id++,studentName,studentSex,age);
    }


    public static int showSecondMenu() {
        System.out.println("==========================================");
        System.out.println("1.According to the student number ");
        System.out.println("2.According to the name ");
        System.out.println("3.According to the sex");
        System.out.println("4.According to the age ");
        System.out.println("5.All Student");
        System.out.println("==========================================");

        int number;
        do {
            System.out.println("Please Input the right number : ");
            number = new Scanner(System.in).nextInt();
        }while(number > 5 || number < 1);
        return number;
    }

    public static void showSingleStudentInfo(Student student) {
        System.out.printf("\n\n\n");
        System.out.println(student);
        System.out.printf("\n\n\n");
    }
}
