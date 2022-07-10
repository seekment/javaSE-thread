package demo07_lambda;

/**
 * @ClassName TestLambda
 * @Author yang
 * @Description //TODO
 * @Date 22/07/10 22:10
 * @Version v1.0
 **/

// 静态内部类
public class TestLambda2 {
    static class  Love2 implements ILove2{
        @Override
        public void love(int a) {
            System.out.println("i love you " + a);
        }
    }

    public static void main(String[] args) {
        Love2 love = new Love2();
        love.love(4);
    }
}

interface ILove2{
    void love(int  a);
}

