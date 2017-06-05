package visitor;

/**
 * 具体拜访者:饭店厨师
 * Created by zhangss on 2017/6/5.
 */
public class VisitorCook implements IVisitor {
    private String name;

    public VisitorCook(String name) {
        this.name = name;
    }

    @Override
    public void visit(ElementFood elementFood) {
        System.out.println("我是厨师" + name + ",给消费者:" + elementFood.getElementName());
    }

    @Override
    public void visit(ElementDrink elementDrink) {
        System.out.println("我是厨师" + name + ",给消费者:" + elementDrink.getElementName());
    }
}
