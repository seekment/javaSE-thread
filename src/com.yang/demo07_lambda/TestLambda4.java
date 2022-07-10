package demo07_lambda;

/**
 * @ClassName TestLambda3
 * @Author yang
 * @Description //TODO
 * @Date 22/07/10 22:10
 * @Version v1.0
 **/

// 匿名内部类
public class TestLambda4 {

    public static void main(String[] args) {
        ILove4 love =  new ILove4(){
            @Override
            public void love(int a) {
                System.out.println("i love you TestLambda4 " + a);
            }
        }; // 这里容易忘记加；

       // Love3 love = new Love3();
        love.love(4);
    }
}

interface ILove4{
    void love(int  a);
}

