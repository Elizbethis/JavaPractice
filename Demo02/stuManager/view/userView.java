package Second.Demo02.stuManager.view;

import Second.Demo02.stuManager.global.User;
import Second.Demo02.stuManager.model.userModel;

import java.util.ArrayList;
import java.util.Scanner;

public class userView {
    //创建模型层对象,用于Ajax操作
    private static userModel um = new userModel();

    //view层的一个欢迎界面
    public static int Welcome() {
        System.out.println("* ***************************** *");
        System.out.println("* 欢迎使用学生管理系统");
        System.out.println("* 1 - 登陆");
        System.out.println("* 2 - 注册");
        System.out.println("* 0 - 退出");
        System.out.println("* ***************************** *");
        //返回一个选择功能的值
        int a;
        do{
            System.out.println("请输入正确的序号：");
            a = new Scanner(System.in).nextInt();
        }while(a > 2 || a < 0);
        return a;
    }
    //欢迎界面
    public static void welcomeBack(String userName) {
        System.out.println("欢迎 - " +userName+ " - 回来");
    }

    public static User getLoginInfo() {
        System.out.print("请输入用户名：");
        String userName = new Scanner(System.in).nextLine();
        System.out.print("请输入密码：");
        String password = new Scanner(System.in).nextLine();
        return new User(userName,password);
    }

    public static void userErrorPage(String info) {
        System.out.println("用户相关操作失败 ： " + info);
    }

    public static User getRegInfo(ArrayList<User> userList) {
        User user = null;
        String userName;
        String password;
        do{
            System.out.println("请输入有效的用户名：");
            userName = new Scanner(System.in).nextLine();
        }while(um.exists(userName,userList));

        do{
            System.out.println("请输入新的密码：");
            password = new Scanner(System.in).nextLine();
            System.out.println("请输入确认密码：");
        }while(!password.equals(new Scanner(System.in).nextLine()));
        return new User(userName,password);
    }
}
