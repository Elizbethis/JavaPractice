package Second.Demo02.ThreadPractice.Threadsyn;

import com.sun.source.tree.SynchronizedTree;

public class sellTickets implements Runnable{
    private int tickets = 1000;
    @Override
    public void run() {
        while(true){
            sellTick();
        }
    }

    private synchronized void sellTick() {
        if (tickets > 0){
            System.out.println(Thread.currentThread().getName() + tickets);
            tickets--;
        }
    }
}
