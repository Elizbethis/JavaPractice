package Second.Demo02.ThreadPractice.CustomerProducerModule;

public class Test {
    public static void main(String[] args) {
        Box box = new Box();
        //创建消费者与生成者
        Customer customer = new Customer(box);
        Producer producer = new Producer(box);

        //创建线程对象
        Thread THCustomer01 = new Thread(customer,"Customer01");
        Thread THCustomer02 = new Thread(customer,"Customer02");
        Thread THProducer = new Thread(producer,"Producer");

        THCustomer01.start();
        THCustomer02.start();
        THProducer.start();
    }
}
