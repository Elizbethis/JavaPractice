package Second.Demo02.Mappractice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMap嵌套ArrayLIst {
    public static void main(String[] args) {
        HashMap<String,ArrayList<String>> hashMap = new HashMap<>();
        //创建了三个ArrayList对象
        ArrayList<String> l01 = new ArrayList<>();
        l01.add("周润发");
        l01.add("张国荣");
        l01.add("谭咏麟");
        l01.add("刘德华");

        ArrayList<String> l02 = new ArrayList<>();
        l02.add("郭德纲");
        l02.add("于谦");
        l02.add("岳云鹏");
        l02.add("孙越");

        ArrayList<String> l03 = new ArrayList<>();
        l03.add("刘翔");
        l03.add("孙杨");
        l03.add("李永波");
        l03.add("孙福明");

        //将三个对象放入HashMap中
        hashMap.put("港台大咖", l01);
        hashMap.put("相声演员", l02);
        hashMap.put("奥运冠军", l03);


        //下面对其进行分组遍历
        //类似于菜单操作
        //1.通过键值对进行遍历
        Set<Map.Entry<String, ArrayList<String>>> entries = hashMap.entrySet();
        for (Map.Entry<String, ArrayList<String>> map : entries){
            String key = map.getKey();
            ArrayList<String> values = map.getValue();
            System.out.println("==========="+ key +"===========");
            for (String strings : values){
                System.out.println(strings);
            }
        }


        //2.先拿到键的set集合，然后进行遍历
        Set<String> keys = hashMap.keySet();
        for (String keyString : keys){
            ArrayList<String> value = hashMap.get(keyString);
            System.out.println("==========="+ keyString +"===========");
            for (String values : value){
                System.out.println(values);
            }
        }
    }
}
