package demo02;

import demo01.TestThread2;

/**
 * @ClassName TestThread
 * @Author yang
 * @Description //TODO
 * @Date 22/07/10 17:43
 * @Version v1.0
 **/

// 创建线程方式2：实现runable接口，重写run方法，
public class TestThread implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println("子线程"+i);
        }
    }

    public static void main(String[] args) {

        TestThread testThread = new TestThread();

        Thread thread = new Thread(testThread);
        thread.start();

        // 一般使用如下方法执行
       // new Thread(testThread).start();

        for (int i = 0; i < 2000; i++) {
            System.out.println("mian");
        }

    }
}
