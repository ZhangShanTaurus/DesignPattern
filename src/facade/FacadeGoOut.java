package facade;

/**
 * 外观类:出门
 * Created by zhangss on 2017/6/1.
 */
public class FacadeGoOut implements IFacade {

    private Light light;
    private Door door;

    public FacadeGoOut() {
        light = new Light();
        door = new Door();
    }

    @Override
    public void open() {
        System.out.println("---回家了---");
        door.open();
        light.turnOn();
    }

    @Override
    public void close() {
        System.out.println("---出门了---");
        light.turnOff();
        door.close();
    }
}
