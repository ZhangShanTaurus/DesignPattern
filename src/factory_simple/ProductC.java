package factory_simple;

/**
 * 产品C
 * Created by zhangss on 2017/5/26.
 */
public class ProductC implements IProduct{

    @Override
    public void getProduct() {
        System.out.println("得到ProductC");
    }
}
