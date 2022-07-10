package demo08_five_status_for__thread;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @ClassName TestSleeep2
 * @Author yang
 * @Description 模拟倒计时
 * @Date 22/07/10 22:53
 * @Version v1.0
 **/

// 模拟倒计时 ， 获取系统时间
public class TestSleeep2 {
    public static void main(String[] args) throws InterruptedException {
        tenDown();
        // 获取系统时间
        Date starteDate = new Date(System.currentTimeMillis());
        while (true){
            Thread.sleep(1000);
            System.out.println(new SimpleDateFormat("HH:mm:ss").format(starteDate));
            // 更新系统时间
            starteDate = new Date(System.currentTimeMillis());
        }
    }
    // 模拟倒计时
    public static void tenDown( ) throws InterruptedException {
        int num = 10;
        while (true){
            Thread.sleep(100);
            System.out.println(num--);
            if (num <= 0)
                break;
        }

    }
}
