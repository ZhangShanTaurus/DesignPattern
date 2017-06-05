package visitor;

/**
 * 具体拜访者:饭店收银员
 * Created by zhangss on 2017/6/5.
 */
public class VisitorCashier implements IVisitor {
    private String name;

    public VisitorCashier(String name) {
        this.name = name;
    }

    @Override
    public void visit(ElementFood elementFood) {
        System.out.println("我是收银员" + name + ",消费者点餐:" + elementFood.getElementName() + ",价格为:" + elementFood.getElementPrice());
    }

    @Override
    public void visit(ElementDrink elementDrink) {
        System.out.println("我是收银员" + name + ",消费者点餐:" + elementDrink.getElementName() + ",价格为:" + elementDrink.getElementPrice());
    }
}
