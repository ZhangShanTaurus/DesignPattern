package factory_method;

/**
 * 生产食物的工厂
 * Created by zhangss on 2017/5/26.
 */
public class FactoryFood implements IFactory {
    @Override
    public IProduct createProduct(ProductType type) throws Exception {
        switch (type) {
            case PRODUCT_FOOT_CHICKEN:
                return new FoodChicken();
            case PRODUCT_FOOT_RICE:
                return new FoodRice();
            default:
                throw new Exception("该工厂无此产品");
        }
    }
}
