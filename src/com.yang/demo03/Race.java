package demo03;

/**
 * @ClassName Race
 * @Author yang
 * @Description 实现龟兔赛跑
 * @Date 22/07/10 18:06
 * @Version v1.0
 **/


public class Race implements  Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + "买了" + i+"步");
        }
    }
}
