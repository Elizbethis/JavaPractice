package Second.Demo02.Mappractice;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class __自定义学生类的遍历__ {
    public static void main(String[] args) {
        //创建hashMap，并向里面添加元素
        HashMap<String, Student> studentHashMap = new HashMap<>();
        studentHashMap.put("STU001", new Student("张三", 17));
        studentHashMap.put("STU002", new Student("李四", 13));
        studentHashMap.put("STU003", new Student("王五", 15));
        studentHashMap.put("STU004", new Student("马六", 12));

        //对自定义学生类的集合进行遍历

        //1.通过获取key来进行元素的遍历
        Set<String> keys = studentHashMap.keySet();
        for (String key : keys){
            Student student = studentHashMap.get(key);
            System.out.println(key + "<===>" + student);
        }

        //2.直接获取hashmap值的集合
        Collection<Student> values = studentHashMap.values();
        for (Student student : values){
            System.out.println(student.getName() + "  " +student.getAge());
        }

        //3.直接获取键值对的集合
        Set<Map.Entry<String, Student>> entries = studentHashMap.entrySet();
        for (Map.Entry<String,Student> map : entries){
            System.out.println(map.getKey() + "<========>" + map.getValue().toString());
        }
    }
}
