package demo01;

import java.io.File;
import java.net.URL;
import java.util.logging.FileHandler;
import java.io.IOException;
import java.net.URLEncoder;

import sun.misc.BASE64Encoder;

/**
 * @ClassName TestThread2
 * @Author yang
 * @Description //TODO
 * @Date 22/07/10 16:41
 * @Version v1.0
 **/

// 练习thread, 实现多线程同步下载图片
public class TestThread2 extends Thread{
    private String url;
    private String name;

  public   TestThread2(String url, String name){
        this.name = name;
        this.url = url;
    }
    @Override
    public void run() {
        //super.run();
        // WebDoenloader webDoenloader = new WebDoenloader();
        // webDoenloader.downLoader(url,name )
    }

    public static void main(String[] args) {
         String url = "";
         String name = "";
        TestThread2 testThread2 = new TestThread2(url,name);
        testThread2.start();
        System.out.println();
    }
}
/*
// 下载器
class WebDoenloader{
    public void downLoader(String url, String name){
        try{
            FileUtils.copyURLToFiel(new URL(url),
                    new File(name));
        }catch (IOException e){
            e.printStackTrace();
            System.out.println("io异常");
        }


    }

}

*/

