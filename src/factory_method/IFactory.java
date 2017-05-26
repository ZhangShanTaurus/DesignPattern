package factory_method;

/**
 * 抽象工厂
 * Created by zhangss on 2017/5/26.
 */
public interface IFactory {

    /**
     * 生产产品
     *
     * @param type 产品类型
     * @return 具体产品
     */
    IProduct createProduct(ProductType type) throws Exception;
}
