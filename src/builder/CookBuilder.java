package builder;

/**
 * 具体建造者:做饭构建者，实现组成部分的构建
 * Created by zhangss on 2017/5/31.
 */
public class CookBuilder implements IBuilder<Product> {
    private Product product = new Product();

    @Override
    public void buildPartA() {
        product.addPart("做饭:去市场买菜");
    }

    @Override
    public void buildPartB() {
        product.addPart("做饭:到家洗洗菜");
    }

    @Override
    public void buildPartC() {
        product.addPart("做饭:用锅炒炒菜");
    }

    @Override
    public Product getResult() {
        return product;
    }
}
