package factory_method;

/**
 * 甜水
 * Created by zhangss on 2017/5/26.
 */
public class WaterSweet implements IProduct {

    @Override
    public void getProduct() {
        System.out.println("我是甜水");
    }
}
