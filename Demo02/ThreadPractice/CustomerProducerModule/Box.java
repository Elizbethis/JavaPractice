package Second.Demo02.ThreadPractice.CustomerProducerModule;

public class Box {
    //定义一个记录牛奶的次序的数量
    //因为拿牛奶的时候会出现也要使用这个数据的情况
    private int countMilk ;
    //定义牛奶的状态，默认为奶箱里没有牛奶
    private boolean milkState = false;

    public synchronized void getMilk(){
        //首先判断有无牛奶，如果没有牛奶就要等待送牛奶
        if (!milkState){
            try {
                //等待中说明取不到牛奶，所以程序需要暂停等待
                //加入wait使程序无法向下执行
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        //执行到这里说明可以取到牛奶
        System.out.println(Thread.currentThread().getName() + "拿到了第" + this.countMilk + "瓶牛奶");
        //将奶盒清空
        this.milkState = false;
        //清空后应该提醒送牛奶的及时补充牛奶
        notifyAll();
    }

    public synchronized void sendMilk(int countMilk){
        //判断是否有牛奶
        if (milkState){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        //需要指定送的是第几盒牛奶
        this.countMilk = countMilk;
        System.out.println(Thread.currentThread().getName() + "正在送" + this.countMilk + "瓶牛奶");
        //送完牛奶将奶盒补充
        this.milkState = true;
        //通知赶紧送牛奶
        notifyAll();
    }
}
