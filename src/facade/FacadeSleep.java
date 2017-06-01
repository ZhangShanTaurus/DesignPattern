package facade;

/**
 * 外观类：睡觉
 * Created by zhangss on 2017/6/1.
 */
public class FacadeSleep implements IFacade {

    private Light light;
    private Television television;

    public FacadeSleep() {
        light = new Light();
        television = new Television();
    }

    @Override
    public void open() {
        System.out.println("---睡醒了---");
        light.turnOn();
        television.turnOnTV();
    }

    @Override
    public void close() {
        System.out.println("---要睡觉了---");
        television.turnOffTV();
        light.turnOff();
    }
}
