package demo09_yield__thread;

/**
 * @ClassName TestYield
 * @Author yang
 * @Description //TODO
 * @Date 22/07/10 23:02
 * @Version v1.0
 **/

// 线程礼让
public class TestYield  {
    public static void main(String[] args) {
        MyYield myYield = new MyYield();
        new Thread(myYield , "a").start();
        new Thread(myYield , "b").start();
        new Thread(myYield , "c").start();
        System.out.println("main");
    }
}

 class MyYield implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " start");
        Thread.yield();
        System.out.println(Thread.currentThread().getName() +" end");
    }
}

