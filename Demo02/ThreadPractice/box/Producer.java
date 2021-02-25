package Second.Demo02.ThreadPractice.box;

public class Producer implements Runnable{
    private Box b;

    public Producer(Box b) {
        this.b = b;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 7; i++) {
            b.put(i);
        }
    }
}