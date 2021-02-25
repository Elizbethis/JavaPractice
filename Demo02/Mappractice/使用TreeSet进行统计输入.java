package Second.Demo02.Mappractice;

import jdk.nashorn.api.tree.Tree;

import java.util.*;

public class 使用TreeSet进行统计输入 {


    //根据treeMap向里面添加元素
    public static void main(String[] args) {
        //Map接口的实现类常用的包括HashMap，TreeMap
        //由于TreeMap集合的特性，向其中添加元素的时候会自动排序
        //并且Map集合的特性是重复元素不添加，重复添加相当于更新
        //创建一个Map集合存储信息
        TreeMap<Character, Integer> treeMap = new TreeMap<>();

        //按需要读取数据
        String userString = new Scanner(System.in).nextLine();
        //进行统计
        for (int i = 0;i<userString.length();i++){
            //按下标取出每个字母
            char character = userString.charAt(i);
            //根据map的key值拿出对应的值
            Integer number = treeMap.get(character);
            if (null == number){
                treeMap.put(character,1);
            }else{
                treeMap.put(character,++number);
            }
        }

        //下面对treemap进行遍历
        Set<Map.Entry<Character, Integer>> entries = treeMap.entrySet();
        for (Map.Entry<Character, Integer> element : entries){
            System.out.println(element.getKey() + ":" +element.getValue());
        }
    }
}
