/**
 * @ClassName TestThread
 * @Author yang
 * @Description //TODO
 * @Date 22/07/10 16:32
 * @Version v1.0
 **/

// 传建线程方法1：继承thread, 重写run方法
public class TestThread extends Thread{
    @Override
    public void run() {
      // super.run();
        for (int i = 0; i < 20; i++) {
            System.out.println("我在看代码");
        }

    }

    public static void main(String[] args) {
        TestThread testThread = new TestThread();
        //testThread.run(); 顺序执行
        testThread.start();
        for (int i = 0; i < 20; i++) {
            System.out.println("main"+i);
        }

    }
}
