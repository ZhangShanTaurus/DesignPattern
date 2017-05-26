package factory_method;

/**
 * 苦水
 * Created by zhangss on 2017/5/26.
 */
public class WaterBitter implements IProduct {
    @Override
    public void getProduct() {
        System.out.println("我是苦水");
    }
}
