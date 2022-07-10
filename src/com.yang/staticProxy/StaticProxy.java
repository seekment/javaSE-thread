package staticProxy;

/**
 * @ClassName StaticProxy
 * @Author yang
 * @Description //TODO
 * @Date 22/07/10 18:26
 * @Version v1.0
 **/

// 静态代理，开始结婚
public class StaticProxy {
    public static void main(String[] args) {
        WeddingCompany weddingCompany = new WeddingCompany(new You());
        weddingCompany.happyMarry();
        System.out.println();
    }
}

interface Marry{
    void happyMarry();
}

// 真实角色
class You implements  Marry{
    @Override
    public void happyMarry() {
        System.out.println("你结婚了");
    }
}
// 代理角色，帮助你结婚
class WeddingCompany implements  Marry{
    private Marry target;
    WeddingCompany(Marry target){
        this.target = target;
    }

    public WeddingCompany() {

    }

    @Override
    public void happyMarry() {
        before();
        target.happyMarry();
        after();
    }

    private void after() {
        System.out.println("结婚之后，生孩子");
    }

    private void before() {
        System.out.println("结婚之前，开始布置");
    }
}