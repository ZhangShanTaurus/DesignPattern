package factory_method;

/**
 * 鸡肉
 * Created by zhangss on 2017/5/26.
 */
public class FoodChicken implements IProduct {

    @Override
    public void getProduct() {
        System.out.println("我是鸡肉");
    }
}
