package demo07_lambda;

/**
 * @ClassName TestLambda3
 * @Author yang
 * @Description //TODO
 * @Date 22/07/10 22:10
 * @Version v1.0
 **/

// 内部类
  class TestLambda3 {

    public static void main(String[] args) {
        class  Love3 implements ILove3{
            @Override
            public void love(int a) {
                System.out.println("i love you TestLambda3 " + a);
            }
        }
        Love3 love = new Love3();
        love.love(4);
    }
}

interface ILove3{
    void love(int  a);
}

