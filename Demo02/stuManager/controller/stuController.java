package Second.Demo02.stuManager.controller;

import Second.Demo02.stuManager.global.Student;
import Second.Demo02.stuManager.global.User;
import Second.Demo02.stuManager.model.stuModel;
import Second.Demo02.stuManager.view.stuView;

import java.util.ArrayList;

public class stuController {
    private stuModel sm = new stuModel();
    //学生信息控制器
    public void stuAction(int a, ArrayList<Student> stuList, User user) {
        switch (a) {
            case 1: // 浏览学员
                int number = stuView.showSecondMenu();
                secondMenuAction(number,stuList);
                /*System.out.println("show stu==================");
                stuView.showStuList(stuList);*/
                break;
            case 2: // 添加学员
                System.out.println("add stu===================");
                while(sm.addeStudent(stuList));
                break;
            case 3: // 修改学员
                System.out.println("update stu================");
                int id = stuView.getEditStuID();
                Student editStu = sm.selByStuID(id,stuList);
                if (editStu == null){
                    stuView.errorPage("没有找到学生信息");
                    break;
                }
                editStu = stuView.editStuInfo(editStu);
                sm.updateStuInfo(editStu,stuList);
                break;
            case 4: // 删除学员
                System.out.println("delete stu==================");
                //做循环进行，不断检测输入的名字是否存在\
                Student stu = null;
                while(true){
                    stu = sm.getDelStudent(stuList);
                    if (stu != null)
                        break;
                }
                sm.delStudent(stu,stuList);
                System.out.println(stu);
                break;
            case 0: // 退出系统
                System.out.println("Bye！~");
                sm.outPut(stuList);
                System.exit(0);
                break;
        }
    }

    private void secondMenuAction(int number, ArrayList<Student> stuList) {
        switch (number){
            case 1:
                //根据学号进行查询
                Student student = sm.getNumberStudent(stuList);
                stuView.showSingleStudentInfo(student);
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                System.out.println("All student page ");
                stuView.showStuList(stuList);
                break;
        }
    }
}
