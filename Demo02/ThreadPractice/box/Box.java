package Second.Demo02.ThreadPractice.box;

public class Box {
    // 第几瓶牛奶
    private int milk;
    // 奶箱状态的
    private boolean state = false; // 默认奶箱里么有牛奶

    /**
     * 生产牛奶
     *
     * @param milk
     */
    public synchronized void put(int milk) {
        if (state) { // 如果奶箱里有牛奶的话就得等着，不能往里放
            try {
                wait(); // 线程等待
                // 这个等待和sleep不同，wait等待的线程，你不唤醒它，它就一直等下去
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        // 如果奶箱是空的那就可以送，生产牛奶
        this.milk = milk;
        System.out.println("京东小哥将第" + this.milk + "瓶牛奶放进了奶箱！~");
        // 修改奶箱状态
        this.state = true;
        // 唤醒
        notifyAll();
    }

    public synchronized void get() {
        // 如果奶箱是空的就等待
        if (!state) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        // 不是空的，有奶就拿走喝了，大补
        System.out.println("小甜甜将第" + this.milk + "瓶牛奶拿走补身体去了！~");
        // 修改奶箱状态
        this.state = false;
        // 唤醒所有正在等待的线程
        notifyAll();
    }
}
