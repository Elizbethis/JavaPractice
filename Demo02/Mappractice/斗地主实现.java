package Second.Demo02.Mappractice;

import java.util.*;

public class 斗地主实现 {
    public static void main(String[] args) {
        //纸牌盒子
        HashMap<Integer, String> card = new HashMap<>();
        //用于计数随机的集合
        ArrayList<Integer> arrIndex = new ArrayList<>();
        String[] colors = {"♥", "♠", "♦", "♣"};
        String[] nums = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};

        int index = 0;
        for (String color : colors){
            for (String num : nums){
                card.put(index, color + num);
                arrIndex.add(index++);
            }
        }
        // 大小王单独处理
        card.put(index, "大王");
        arrIndex.add(index++);
        card.put(index, "小王");
        arrIndex.add(index);
        //洗牌
        Collections.shuffle(arrIndex);
        //定义玩家以及底牌
        TreeSet<Integer> player01 = new TreeSet<>();
        TreeSet<Integer> player02 = new TreeSet<>();
        TreeSet<Integer> player03 = new TreeSet<>();
        TreeSet<Integer> lastThreeCard = new TreeSet<>();

        //下面是发牌操作
        for(int i = 0;i<arrIndex.size();i++){
            if (i >= arrIndex.size() - 3){
                lastThreeCard.add(i);
            }
        }
    }
}
