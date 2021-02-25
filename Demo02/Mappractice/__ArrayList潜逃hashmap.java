package Second.Demo02.Mappractice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class __ArrayList潜逃hashmap {
    public static void main(String[] args) {
        ArrayList<HashMap<String, String>> arrayList = new ArrayList<>();
        HashMap<String, String> hm01 = new HashMap<>();
        HashMap<String, String> hm02 = new HashMap<>();
        HashMap<String, String> hm03 = new HashMap<>();

        hm01.put("玉帝", "王母");
        hm01.put("土地公", "土地婆");
        hm01.put("雷公", "电母");

        hm02.put("牛群", "风格");
        hm02.put("郭德纲", "于谦");
        hm02.put("岳云鹏", "孙越");

        hm03.put("冰哥", "冰嫂");
        hm03.put("冰叔", "冰婶");
        hm03.put("冰大爷", "冰大娘");

        //将其添加到arrayList中
        arrayList.add(hm01);
        arrayList.add(hm02);
        arrayList.add(hm03);

        //对其进行遍历

        for (int i = 0;i < arrayList.size();i++){
            System.out.println("=====这是第" + i + "组=====");
            HashMap<String, String> map = arrayList.get(i);
            //使用直接获取键值对的方式
            Set<Map.Entry<String, String>> entries = map.entrySet();
            for (Map.Entry<String, String> element : entries){
                System.out.println(element.getKey() + "<===>" + element.getValue());
            }
        }
    }
}
