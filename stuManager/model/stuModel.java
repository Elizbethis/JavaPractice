package Second.Demo02.stuManager.model;

import Second.Demo02.stuManager.global.Student;
import Second.Demo02.stuManager.view.stuView;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class stuModel {

    public Student selByStuID(int id, ArrayList<Student> stuList) {
        for(Student stu : stuList){
            if(id == stu.getId())
                return stu;
        }
        return null;
    }

    public void updateStuInfo(Student editStu, ArrayList<Student> stuList) {
        for (int i = 0; i < stuList.size(); i++) {
            if (stuList.get(i).getId() == editStu.getId())
                stuList.set(i,editStu);
        }
    }

    public boolean addeStudent(ArrayList<Student> stuList) {
        Student stu = stuView.getStudentInfo();
        if (stu == null)
            return false;
        return stuList.add(stu);
    }

    public Student getDelStudent(ArrayList<Student> stuList) {
        Student delStudent = null;
        System.out.println("Please input the name of delstudent : ");
        String delStudentName = new Scanner(System.in).nextLine();
        for (Student stu : stuList){
            if (delStudentName.equals(stu.getName()))
                delStudent = stu;
        }
        return delStudent;
    }

    public void delStudent(Student stu, ArrayList<Student> stuList) {
        stuList.remove(stu);
    }

    public Student getNumberStudent(ArrayList<Student> stuList) {
        Student student = null;
        int IDNumber = new Scanner(System.in).nextInt();
        for (Student stu : stuList){
            if (IDNumber == stu.getId())
                student = stu;
        }
        return student;
    }

    public void outPut(ArrayList<Student> stuList) {
        File file = new File("/Users/mac/Desktop/intmain/bbb.txt");
        ObjectOutput oos = null;
        try {
            oos = new ObjectOutputStream(new FileOutputStream(file));
            oos.writeObject(stuList);
            oos.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                oos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public ArrayList<Student> inPut() {
        File file = new File("/Users/mac/Desktop/intmain/bbb.txt");
        ObjectInput ois = null;
        ArrayList<Student> stuList = null;
        try {
            ois = new ObjectInputStream(new FileInputStream(file));
            stuList = (ArrayList<Student>) ois.readObject();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }finally {
            try {
                ois.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return stuList;
    }
}
