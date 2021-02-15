package Second.Demo02.stuManager.controller;

import Second.Demo02.stuManager.global.User;
import Second.Demo02.stuManager.model.userModel;
import Second.Demo02.stuManager.view.userView;

import java.util.ArrayList;

public class userController {
    private userModel um = new userModel();
    //按照相应的view层获得的值，进行功能的执行
    public User userAction(int a, ArrayList<User> userList) {
        User user = null;
        switch (a){
            case 1:
                for (int i = 0; i < 3; i++) {
                    //需要用户进行读入，转交给view进行执行
                    //通过view进行一个用户的读入
                    User loginUser = userView.getLoginInfo();
                    //将读入的用户数据与数据库中的数据进行比较
                    //所以将loginUser与model层，调用model层的doLogin方法
                    user = um.doLogin(loginUser,userList);
                    if (user != null)
                        break;
                    System.out.println("您还有" +(2-i)+ "次机会！");
                }
                break;
            case 2:
                User regUser = userView.getRegInfo(userList);
                user = um.doRegister(regUser,userList);
                //注册成功后也需要重新登陆
                user = userAction(userView.Welcome(),userList);
                break;
            case 0:
                break;
        }
        return user;
    }
}
