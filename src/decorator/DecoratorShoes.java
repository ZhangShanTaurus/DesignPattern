package decorator;

/**
 * 具体装饰器角色:装饰鞋子
 * Created by zhangss on 2017/5/31.
 */
public class DecoratorShoes extends Decorator {

    public DecoratorShoes(Component component) {
        super(component);
    }

    private void beforeOperation() {
        System.out.println("开始装饰啦");
    }

    private void afterOperation() {
        System.out.println("装饰结束啦");
    }

    public void decorator() {
//        beforeOperation();
        super.decorator("穿Nick牌运动鞋");
//        afterOperation();
    }
}
