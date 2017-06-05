package visitor;

/**
 * 具体元素:主食
 * Created by zhangss on 2017/6/5.
 */
public class ElementFood implements IElement {

    private String name;//名字
    private double price;//价格

    public ElementFood(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String getElementName() {
        return name;
    }

    @Override
    public double getElementPrice() {
        return price;
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
