package demo11_sychronized__thread;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName UnSafeList
 * @Author yang
 * @Description //TODO
 * @Date 22/07/10 23:47
 * @Version v1.0
 **/

// 不安全的列表
public class UnSafeList {
    public static void main(String[] args) {
        System.out.println("start");
        List<String> strings = new ArrayList<>();


        for (int i = 0; i < 1000; i++) {
            new Thread(() -> {
                strings.add(Thread.currentThread().getName());
            }).start();
            // System.out.println("size: "+ strings.size());
        }
        System.out.println("size: " + strings.size());
    }
}
