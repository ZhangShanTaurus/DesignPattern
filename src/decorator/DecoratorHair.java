package decorator;

/**
 * 具体装饰器角色:装饰头发
 * Created by zhangss on 2017/5/31.
 */
public class DecoratorHair extends Decorator {

    public DecoratorHair(Component component) {
        super(component);
    }

    public void decorator() {
        super.decorator("带着红色的假发");
    }
}
