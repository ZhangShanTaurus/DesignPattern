package proxy_static;

/**
 * 玩具生产者1
 * Created by zhangss on 2017/5/26.
 */
public class ToyMakerImp1 implements IToyMaker {

    private String name;

    public ToyMakerImp1(String name) {
        this.name = name;
    }

    @Override
    public void sellTeddy(Customer customer) {
        System.out.println("我是" + name + ",我出售给" + customer.getName() + "泰迪熊");
    }

    @Override
    public void sellBarbie(Customer customer) {
        System.out.println("我是" + name + ",我出售给" + customer.getName() + "芭比娃娃");
    }
}
