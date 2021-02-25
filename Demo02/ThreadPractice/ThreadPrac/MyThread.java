package Second.Demo02.ThreadPractice.ThreadPrac;

public class MyThread extends Thread{
    public MyThread(){

    }
    //创建构造方法可以在创建对象的时候进行线程名字的初始化
    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 1;i <= 20 ;i++){
            System.out.println(this.getName() + "<======>" + i);
        }
    }
}
