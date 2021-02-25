package Second.Demo02.CollectionPractice;

import java.util.Arrays;
import java.util.Scanner;

public class PracticeDemo01 {
    public static void main(String[] args) {
        //向已有的数组插入一个数字，使其仍然有序
        //创建一个新的数组，留出一个位置
        int[] array = {1,2,3,4,5,6,7,8,9,0};
        //读入一个想要插入的数字
        int number = new Scanner(System.in).nextInt();
        //首先找到要插入数字的位置
        int place ;
        for (place = 0; place < array.length; place++) {
            //如果目标位置大于要插入的数字，停止
            if (array[place] > number)
                break;
        }
        //不断交换目标插入值与index的值
        //使用车轮插入法插入此数据
        for (int i = place ; i < array.length;i++){
            //暂存index的值，number插入，再将index的值给number，重复
            //本质是交换数据
            int swapNumber = array[i];
            array[i] = number;
            number = swapNumber;
        }

        System.out.println(Arrays.toString(array));
    }
}
