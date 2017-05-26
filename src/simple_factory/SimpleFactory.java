package simple_factory;

/**
 * 简单工厂
 * Created by zhangss on 2017/5/26.
 */
public class SimpleFactory {

    /**
     * 获取产品
     *
     * @param type 根据产品类型生产相应的具体产品(@link ProductType)
     * @return 具体产品
     * @throws Exception 没有该产品类型对应的具体产品时抛出异常
     */
    public IProduct getProduct(ProductType type) throws Exception {
        IProduct product;
        switch (type) {
            case PRODUCT_A:
                product = new ProductA();
                break;
            case PRODUCT_B:
                product = new ProductB();
                break;
            case PRODUCT_C:
                product = new ProductC();
                break;
            case PRODUCT_D:
            default:
                throw new Exception("没有产品D");
        }
        return product;
    }
}
