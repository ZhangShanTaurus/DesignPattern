package simple_factory;

/**
 * 产品B
 * Created by zhangss on 2017/5/26.
 */
public class ProductB implements IProduct{

    @Override
    public void getProduct() {
        System.out.println("得到ProductB");
    }
}
