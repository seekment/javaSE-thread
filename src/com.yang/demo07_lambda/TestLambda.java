package demo07_lambda;

/**
 * @ClassName TestLambda
 * @Author yang
 * @Description //TODO
 * @Date 22/07/10 22:10
 * @Version v1.0
 **/

// 简单实现
public class TestLambda {
    public static void main(String[] args) {
        Love love = new Love();
        love.love(4);
    }
}

interface ILove{
    void love(int  a);
}

class  Love implements ILove{
    @Override
    public void love(int a) {
        System.out.println("i love you" + a);
    }
}
