package demo07_lambda;

/**
 * @ClassName TestLambda5_Lambda
 * @Author yang
 * @Description //TODO
 * @Date 22/07/10 22:30
 * @Version v1.0
 **/


public class TestLambda5_Lambda {
    public static void main(String[] args) {
        ILove4 love =  (a) -> {

           // public void love(int a) {
                System.out.println("i love you TestLambda5 " + a);
            //}
        }; // 这里容易忘记加；

        // 一行搞定
        ILove5 love2 =  a -> {
            System.out.println("i love you TestLambda5 " + a);
        };


        love.love(4);
        love2.love(777);
    }
}

interface ILove5{
    void love(int  a);
}

