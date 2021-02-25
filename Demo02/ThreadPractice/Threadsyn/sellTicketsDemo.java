package Second.Demo02.ThreadPractice.Threadsyn;

public class sellTicketsDemo {
    public static void main(String[] args) {
        sellTickets sell = new sellTickets();
        Thread TH01 = new Thread(sell,"Window01  >>> ");
        Thread TH02 = new Thread(sell,"Window02  >>> ");
        Thread TH03 = new Thread(sell,"Window03  >>> ");

        //启动线程
        TH01.start();
        TH02.start();
        TH03.start();


    }
}
