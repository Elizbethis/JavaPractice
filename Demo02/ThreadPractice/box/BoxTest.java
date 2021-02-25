package Second.Demo02.ThreadPractice.box;

public class BoxTest {
    public static void main(String[] args) {
        // 定义奶箱
        Box box = new Box();

        // 定义生产者对象
        Producer producer = new Producer(box);
        // 定义消费者对象
        Customer customer = new Customer(box);

        // 声明线程对象
        Thread tp = new Thread(producer);
        Thread tc = new Thread(customer);

        // 启动线程
        tp.start();
        tc.start();
    }
}
