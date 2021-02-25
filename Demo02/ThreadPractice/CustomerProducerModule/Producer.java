package Second.Demo02.ThreadPractice.CustomerProducerModule;

public class Producer implements Runnable{
    private Box box;

    public Producer(Box box) {
        this.box = box;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 100 ; i++) {
            box.sendMilk(i);
        }
    }
}
