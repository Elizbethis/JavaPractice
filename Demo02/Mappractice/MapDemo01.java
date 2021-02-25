package Second.Demo02.Mappractice;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo01 {
    public static void main(String[] args) {
        HashMap<String,String> hashMap = new HashMap<>();
        hashMap.put("STU001", "黄固");
        hashMap.put("STU002", "欧阳锋");
        hashMap.put("STU003", "段智兴");
        hashMap.put("STU004", "洪七公");
        hashMap.put("STU005", "王重阳");

        //添加完成之后选择遍历

        //第一种获取键值对对方式

        //获取所有键的集合
        Set<String> strings = hashMap.keySet();
        //拿到键的集合后，根据键进行键值对的获取
        for (String string : strings){
            System.out.println(string + "<====>" + hashMap.get(string));
        }
        System.out.println("=================================");
        //直接获取值的集合
        Collection<String> values = hashMap.values();
        for (String string : values){
            System.out.println(string);
        }

        System.out.println("================================");

        //直接获取键值对的集合
        Set<Map.Entry<String, String>> entries = hashMap.entrySet();
        for (Map.Entry<String, String> map : entries){
            String number = map.getKey();
            String name = map.getValue();
            System.out.println(number + "<===>" + name);
        }
    }
}
