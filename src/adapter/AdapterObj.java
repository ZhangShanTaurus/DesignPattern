package adapter;

/**
 * 对象适配器：通过组合被适配的类来实现
 * Created by zhangss on 2017/5/31.
 */
public class AdapterObj implements Target {

    private Adaptee adaptee;

    public AdapterObj() {
        adaptee = new Adaptee();
    }

    @Override
    public void requestWater() {
        //调用被适配类的方法，以符合标准接口
        adaptee.requestWater();
    }

    @Override
    public void requestAir() {
        System.out.println("AdapterObj 给你空气呼吸");
    }
}
