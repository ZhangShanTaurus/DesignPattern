package factory_method;

/**
 * 生产水的工厂
 * Created by zhangss on 2017/5/26.
 */
public class FactoryWater implements IFactory {
    @Override
    public IProduct createProduct(ProductType type) throws Exception {
        switch (type) {
            case PRODUCT_WATER_SWEET:
                return new WaterSweet();
            case PRODUCT_WATER_BITTER:
                return new WaterBitter();
            default:
                throw new Exception("该工厂无此产品");
        }
    }
}
