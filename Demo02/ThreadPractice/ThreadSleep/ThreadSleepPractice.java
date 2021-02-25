package Second.Demo02.ThreadPractice.ThreadSleep;

public class ThreadSleepPractice {
    public static void main(String[] args) throws InterruptedException {

        ThreadSleep ts01 = new ThreadSleep("东邪");
        ThreadSleep ts02 = new ThreadSleep("西毒");
        ThreadSleep ts03 = new ThreadSleep("南帝");
        ThreadSleep ts04 = new ThreadSleep("北丐");
        //进行测试

        ts01.start();
        ts01.join();
        ts02.start();

        System.out.println("程序执行完成啦！");
        System.out.println("程序执行完成啦！");
        System.out.println("程序执行完成啦！");
        System.out.println("程序执行完成啦！");
        System.out.println("程序执行完成啦！");
        System.out.println("程序执行完成啦！");
        ts03.start();
        ts04.start();

       /* for (int i = 0 ; i<=20 ;i++){
            System.out.println(i);
            Thread.sleep(5000);
        }*/
    }
}
