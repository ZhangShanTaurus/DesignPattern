package decorator;

/**
 * 具体装饰器角色:装饰外套
 * Created by zhangss on 2017/5/31.
 */
public class DecoratorCoat extends Decorator {

    public DecoratorCoat(Component component) {
        super(component);
    }

    @Override
    public void decorator() {
        super.decorator("穿着黑色的大皮衣");
    }
}
