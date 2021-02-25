package Second.Demo02.ThreadPractice;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Random;

public class KIdding {
    public static int countNumber = 0;
    public static void main(String[] args) {
        ArrayList<Integer> arrayList= new ArrayList<>();
        ArrayList<Integer> randomList = new ArrayList<>();
        Random random = new Random();
        while(randomList.size() < 6){
            int number = random.nextInt(6) + 1;
            if (!randomList.contains(number))
                randomList.add(number);
        }
        System.out.println(randomList);
        powerSort(randomList);
        System.out.printf("共随机了%d次",countNumber);
    }

    public static void powerSort(ArrayList<Integer> arrayList){
        //超级无敌至尊排序
        while(!isSorted(arrayList)){
            Collections.shuffle(arrayList);
            System.out.println(arrayList);
            countNumber ++ ;
        }
    }

    public static boolean isSorted(ArrayList<Integer> arrayList){
        boolean result = true;
        //如果指向为空或者长度为一，则判定为有序集合
        if (null == arrayList || 1 == arrayList.size())
            return result;
        //否则对其进行遍历，依次比较前一个元素和后一个元素是否有序
        Iterator<Integer> it = arrayList.iterator();
        //定义当前指向的变量
        Integer current = it.next();
        while(it.hasNext()){
            Integer previous = current;
            current = it.next();
            if (previous.compareTo(current) > 0 ){
                result = false;
                break;
            }
        }
        return result;
    }
    }
