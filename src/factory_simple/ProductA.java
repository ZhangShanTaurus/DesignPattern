package factory_simple;

/**
 * 产品A
 * Created by zhangss on 2017/5/26.
 */
public class ProductA implements IProduct {

    @Override
    public void getProduct() {
        System.out.println("得到ProductA");
    }
}
