package Second.Demo02.CollectionPractice;

import java.util.*;

public class SimulationDoubleColorBall {
    public static void main(String[] args) {
        System.out.println("请输入你想要的注数");
        int time = new Scanner(System.in).nextInt();
        for (int i = 0; i < time; i++) {
            bonusNumber(i);
        }
    }
    //可以自己选择注数
    public static void bonusNumber(int time){
        //使用数组进行模拟双色球
        //创建红球序列
        int[] redBall = new int[6];
        //创建一个随机对象，可以产生随机数
        Random r = new Random();
        //创建篮球
        int blueBall = r.nextInt(33);
        //对数组进行循环，为其红球序列赋值
        for (int i = 0,j; i < redBall.length; i++) {
            int number = r.nextInt(33);
            //每次随机一个数据就对数组总已有的元素进行便利验证
            //是否存在此数据
            for (j = 0; j < i; j++) {
                if (redBall[j] == number){
                    //相同则直接退出此循环
                    //此index的数据无法填入，
                    // 所以要让i--
                    i--;
                    break;
                }
            }
            //如果数据不重复，则j不小于i
            if(j >= i)
                redBall[i] = number;
        }
        //对红球号码进行排序
        for (int i = 0; i < redBall.length-1; i++) {
            for (int j = 0; j < redBall.length - i - 1; j++) {
                if (redBall[j] > redBall[j+1]){
                    //异或运算
                    redBall[j] ^= redBall[j + 1];
                    redBall[j + 1] ^= redBall[j];
                    redBall[j] ^= redBall[j + 1];
                }
            }
        }
        //下面进行输出环节
        System.out.printf("第%02d注 : 红色球-> " , time);
        for (int number : redBall){
            System.out.printf("%02d ",number);
        }
        System.out.printf("蓝色球 -> %02d\n",blueBall);
    }
}
