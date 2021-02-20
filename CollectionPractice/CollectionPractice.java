package Second.Demo02.CollectionPractice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;
import java.util.Scanner;

public class CollectionPractice {
    public static void main(String[] args) {
        //输入要生成的输入注
        System.out.println("请输入要生成的注数：");
        int count = new Scanner(System.in).nextInt();

        for (int i = 0; i < count; i++) {
            getNumbers(i + 1);
        }
    }

    private static void getNumbers(int ii) {

        Random r = new Random();
        //使用数组进行存储红色球号码
        int[] redBall = new int[6];

        // 生成蓝球号码
        int blueBall = r.nextInt(16) + 1;

        // 生成红球号码
        //外循环进行每个下标的随即填入
        for (int i = 0, j = 0; i < 6; i++) {
            int t = r.nextInt(33) + 1;
            // 找相同的元素
            for (j = 0; j < i; j++) {
                if (t == redBall[j]) {
                    // 找到相同的了，说明生成的值在当前位置不可用
                    // 让当前位置--，在外循环结束之后，会进行++，索引相当于没有变过
                    i--;
                    // 如果发现相同了，那么就没有必要继续比下去了
                    break;
                }
            }
            // 上面的内循环退出会有两个可能，
            // 第一个可能是通过break退出，说明找到相同的了
            // 如果是通过break退出的，说明j的值一定是满足循环条件的，也就是说j小于i
            // 那么也就是说，如果退出循环的时候j小于i，说明生成的随机数t是不可用的
            // 第二个可能是没有执行到break，通过循环条件退出，没有执行到break就说明没找相同的
            // 循环条件是j小于i，那么不满足循环条件的时候退出，此时j一定不小于i
            // 那么也就是说j不小于i的时候，随机数t是可用的
            // 判断当前生成的这个 t 是否可用
            if (j >= i) {
                redBall[i] = t;
            }
        }

        // 输出之前的红球排序
        for (int i = 0; i < redBall.length - 1; i++) {
            for (int j = 0; j < redBall.length - 1 - i; j++) {
                if (redBall[j] > redBall[j + 1]){
                    //异或运算
                    redBall[j] ^= redBall[j + 1];
                    redBall[j + 1] ^= redBall[j];
                    redBall[j] ^= redBall[j + 1];
                }
            }
        }

        // 输出结果
        System.out.printf("第%02d注 ==> 红球：", ii);
        for (int i = 0; i < 6; i++) {
            System.out.printf("  %02d", redBall[i]);
        }
        System.out.printf("  / 蓝球：%02d \n", blueBall);
    }
}
