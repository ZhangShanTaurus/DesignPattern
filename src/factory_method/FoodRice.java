package factory_method;

/**
 * 米饭
 * Created by zhangss on 2017/5/26.
 */
public class FoodRice implements IProduct {

    @Override
    public void getProduct() {
        System.out.println("我是米饭");
    }
}
