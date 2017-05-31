package decorator;

/**
 * 抽象装饰器
 * Created by zhangss on 2017/5/31.
 */
public abstract class Decorator implements Component {

    private Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    /**
     * 装饰
     * 具体装饰类型子类去实现
     */
    public abstract void decorator();

    @Override
    public void decorator(String type) {
        component.decorator(type);
    }
}
