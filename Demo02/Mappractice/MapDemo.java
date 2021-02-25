package Second.Demo02.Mappractice;

import java.util.*;

public class MapDemo {
    public static void main(String[] args) {
        ArrayList<HashMap<String, String>> arrayList = new ArrayList<>();

        HashMap<String,String> hm01 = new HashMap<>();
        hm01.put("玉帝","王母");
        hm01.put("土地公","土地婆");
        hm01.put("雷公","电母");
        HashMap<String, String> hm02 = new HashMap<>();
        hm02.put("牛群","风格");
        hm02.put("郭德纲","于谦");
        hm02.put("岳云鹏","孙越");
        HashMap<String, String> hm03 = new HashMap<>();
        hm03.put("冰哥","冰嫂");
        hm03.put("冰叔","冰婶");
        hm03.put("冰大爷","冰大娘");

        arrayList.add(hm01);
        arrayList.add(hm02);
        arrayList.add(hm03);

        //下面进行遍历
        for (HashMap<String,String> hm : arrayList){
            Set<Map.Entry<String, String>> entries = hm.entrySet();
            for (Map.Entry<String,String> map : entries){
                String key = map.getKey();
                String value = map.getValue();
                System.out.println(key + ", " + value);
            }
        }

        //第二种遍历方式
    }
}
