package proxy_static;

/**
 * 玩具生产者代理类
 * Created by zhangss on 2017/5/26.
 */
public class ToyMakerProxy implements IToyMaker {

    private IToyMaker toyMaker;

    public ToyMakerProxy() {
        toyMaker = new ToyMakerImp1("雷霆生产者");
    }

    public void setToyMaker(IToyMaker realObject) {
        this.toyMaker = realObject;
        System.out.println("更换生产厂家了");
        System.out.println();
    }

    @Override
    public void sellTeddy(Customer customer) {
        //代理类在执行目标对象方法前后可以加自己的处理，而不影响目标对象的业务逻辑
        System.out.println("玩具代理类:开始出售泰迪熊啦");
        toyMaker.sellTeddy(customer);
        System.out.println("玩具代理类:出售泰迪熊结束了");
        System.out.println();
    }

    @Override
    public void sellBarbie(Customer customer) {
        System.out.println("玩具代理类:开始出售芭比娃娃啦");
        toyMaker.sellBarbie(customer);
        System.out.println("玩具代理类:出售芭比娃娃结束了");
        System.out.println();
    }
}
