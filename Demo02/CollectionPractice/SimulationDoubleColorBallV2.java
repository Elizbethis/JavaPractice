package Second.Demo02.CollectionPractice;

import java.util.Random;
import java.util.TreeSet;

public class SimulationDoubleColorBallV2 {
    public static void main(String[] args) {
        Random r = new Random();
        TreeSet<Integer> redBall = new TreeSet<>();
        int blueBall = r.nextInt(33) + 1;
        while(redBall.size() < 6){
            redBall.add(r.nextInt(33) + 1);
        }
        System.out.print("redBall");
        for(Integer number : redBall){
            System.out.printf("%02d  ", number);
        }
        System.out.printf("blueBall");
    }
}
