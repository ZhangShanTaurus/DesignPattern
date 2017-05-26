package observer;

/**
 * 具体观察者
 * Created by zhangss on 2017/5/26.
 */
public class ConcreteObserver implements IObserver {

    private String name;

    public ConcreteObserver(String name) {
        this.name = name;
    }

    @Override
    public void update(String msg) {
        System.out.println("我是" + name + ",收到消息:" + msg);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "ConcreteObserver{" +
                "name='" + name + '\'' +
                '}';
    }
}
