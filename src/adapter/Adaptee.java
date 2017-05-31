package adapter;

/**
 * 已存在的，要被适配的类
 * Created by zhangss on 2017/5/31.
 */
public class Adaptee {

    /**
     * 现有的方法，通过适配器供标准接口使用
     */
    public void requestWater() {
        System.out.println("Adaptee 给你水喝");
    }
}
