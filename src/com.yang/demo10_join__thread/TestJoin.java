package demo10_join__thread;

/**
 * @ClassName TestJoin
 * @Author yang
 * @Description //TODO
 * @Date 22/07/10 23:07
 * @Version v1.0
 **/


public class TestJoin {
}
class MyJoin implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " start");
         //Thread.join();
        System.out.println(Thread.currentThread().getName() +" end");
    }
}
