package Second.Demo02.ThreadPractice.ThreadSleep;

public class ThreadSleep extends Thread{
    public ThreadSleep(){

    }

    public ThreadSleep(String name){
        super(name);
    }

    @Override
    public void run() {
        for (int i = 1; i <= 20 ; i++) {
            System.out.println(this.getName()+ " 正在打出第 " + i + " 招！~");
            try {
                Thread.sleep(250);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
