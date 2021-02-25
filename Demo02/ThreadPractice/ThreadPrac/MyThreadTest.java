package Second.Demo02.ThreadPractice.ThreadPrac;

import com.sun.security.auth.NTDomainPrincipal;

public class MyThreadTest {
    public static void main(String[] args) {
        MyThread MT01 = new MyThread();
        MyThread MT02 = new MyThread();
        MyThread MT03 = new MyThread("线程3 ");
        //像以下这种方式调用只能是顺序执行
        //并不能是启用线程调用
        /*MT01.run();
        MT02.run();*/
        //可以修改线程的名字
        MT01.setName("线程1 ");
        MT02.setName("线程2 ");
        MT01.start();
        MT02.start();
        MT03.start();
        Thread.currentThread().setName("主线程 ");
        //获取当前正在运行的程序的线程对象

        for (int i = 1 ;i <= 20 ;i++){
            System.out.println(Thread.currentThread().getName() + "===>" + i);
        }
    }
}
