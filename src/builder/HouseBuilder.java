package builder;

/**
 * 具体建造者:房子构建者，实现组成部分的构建
 * Created by zhangss on 2017/5/31.
 */
public class HouseBuilder implements IBuilder<Product> {
    private Product product = new Product();

    @Override
    public void buildPartA() {
        product.addPart("盖房子:打地基");
    }

    @Override
    public void buildPartB() {
        product.addPart("盖房子:用砖把房子垒起来");
    }

    @Override
    public void buildPartC() {
        product.addPart("盖房子:装窗户，铺地板装修");
    }

    @Override
    public Product getResult() {
        return product;
    }
}
