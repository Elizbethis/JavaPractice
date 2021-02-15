package Second.Demo02.stuManager.model;

import Second.Demo02.stuManager.global.MyUtils;
import Second.Demo02.stuManager.global.User;

import java.util.ArrayList;

public class userModel {
    //将拿到的loginUser与已有的进行比对
    public User doLogin(User loginUser, ArrayList<User> userList) {
        User user = null;
        for (User u : userList){
            if (u.getUserName().equals(loginUser.getUserName())){
                if (u.getPassword().equals(loginUser.getPassword()))
                    user = u;
            }
        }
        return user;
    }
    //判断用户名是否可用，不存在返回false
    public boolean exists(String userName, ArrayList<User> userList) {
        for (User user:userList){
            if (userName.equals(user.getUserName()))
                return true;
        }
        return false;
    }
    //将用户注册到已有的用户列表中
    public User doRegister(User regUser, ArrayList<User> userList) {
        //添加完整的用户信息到用户列表中
        userList.add(new User(MyUtils.user_id++,regUser.getUserName(),regUser.getPassword(),
                regUser.getState()));
        //将最后一个成员返回
        //return userList.get(userList.size() - 1);
        return selByUserName(regUser.getUserName(),userList);
    }

    private User selByUserName(String userName, ArrayList<User> userList) {
        User user = null;
        for (User u :userList){
            if (userName.equals(u.getUserName()))
                user = u;
        }
        //空表示没找到
        return user;
    }


}
