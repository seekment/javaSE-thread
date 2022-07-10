package demo02;

import java.io.IOException;

/**
 * @ClassName TestThread2
 * @Author yang
 * @Description
 * @Date 22/07/10 17:53
 * @Version v1.0
 **/

// 多个线程同时操作一个对象
    // 买火车票的例子 ,带来了并发问题，数据不一致
public class TestThread2 implements Runnable {
    // 票数
    private int ticketNums = 10;

    @Override
    public void run() {
        while (true) {
            if (ticketNums <= 0) break;
            try {
                Thread.sleep(200);
                System.out.println(Thread.currentThread().getName() + "-->拿到了第" + ticketNums-- + "票");
            }catch ( InterruptedException e){
                e.printStackTrace();
            }

        }
    }

    public static void main(String[] args) {
        TestThread2 ticket =    new TestThread2();
        new Thread(ticket,"小明").start();
        new Thread(ticket,"小红").start();
        new Thread(ticket,"黄牛党").start();
        System.out.println("main");
    }
}

