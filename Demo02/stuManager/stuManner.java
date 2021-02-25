package Second.Demo02.stuManager;

import Second.Demo02.stuManager.controller.stuController;
import Second.Demo02.stuManager.controller.userController;
import Second.Demo02.stuManager.global.MyUtils;
import Second.Demo02.stuManager.global.Student;
import Second.Demo02.stuManager.global.User;
import Second.Demo02.stuManager.model.stuModel;
import Second.Demo02.stuManager.view.stuView;
import Second.Demo02.stuManager.view.userView;

import java.util.ArrayList;

public class stuManner {
    //实例化两个控制器对象

    private static userController uc = new userController();
    private static stuController sc = new stuController();
    public static void main(String[] args) {
        //用户集合
        ArrayList<User> userList = new ArrayList<>();
        //学生集合
        ArrayList<Student> stuList = new stuModel().inPut();


        //初始化一些测试数据,用工具类的静态方法


        //MyUtils.initStuData(stuList);
        MyUtils.initUserData(userList);

        //欢迎界面的
        int a = userView.Welcome();
        //拿到欢迎界面的返回值，上交给controller的userAction进行执行
        //返回一个用户 ，根据用户的状态进行操作1
        User user = uc.userAction(a,userList);
        if (user != null)
            userView.welcomeBack(user.getUserName());
        else{
            userView.userErrorPage("登录失败！");
            System.exit(-1);
        }


        /*while(true){
            sc.stuAction(stuView.showWelcomePage(),stuList,user);
        }*/
        if (user.getState() == 0){
            while(true)
                sc.stuAction(stuView.showWelcomePage(),stuList,user);
        }else{
            while(true)
                sc.stuAction(stuView.showPoorWelcome(),stuList,user);
        }
    }
}
