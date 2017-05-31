package adapter;

/**
 * 类适配器：通过继承被适配的类来实现
 * Created by zhangss on 2017/5/31.
 */
public class AdapterClass extends Adaptee implements Target {

    @Override
    public void requestAir() {
        System.out.println("AdapterClass 给你空气呼吸");
    }
}
