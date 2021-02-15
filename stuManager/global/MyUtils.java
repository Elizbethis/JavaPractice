package Second.Demo02.stuManager.global;

import java.util.ArrayList;

public class MyUtils {
    public static int user_id = 0;
    public static int stu_id = 0;
    //构造方法私有化，不允许创建对象
    private MyUtils(){}
    //初始化用户列表
    public static void initUserData(ArrayList<User> userList) {
        userList.add(new User(user_id++, "root", "toor", 0));
        userList.add(new User(user_id++, "ice", "eci", 1));
        userList.add(new User(user_id++,"毕忠豪","bizhonghao",0));
    }
    //初始化学生列表
    public static void initStuData(ArrayList<Student> stuList){
        stuList.add(new Student(stu_id++,"ZhangSan", "boy", 38));
        stuList.add(new Student(stu_id++,"LiSi", "girl", 16));
        stuList.add(new Student(stu_id++,"WangWu", "boy", 19));
        stuList.add(new Student(stu_id++,"MaLiu", "girl", 18));
        stuList.add(new Student(stu_id++,"NiuQi", "boy", 17));
    }
}
