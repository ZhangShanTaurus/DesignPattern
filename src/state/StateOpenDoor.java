package state;

/**
 * 开门状态
 * 开门状态下只能关门
 * Created by zhangss on 2017/6/2.
 */
public class StateOpenDoor implements ICarState {

    private Context context;

    public StateOpenDoor(Context context) {
        this.context = context;
    }

    @Override
    public void openDoor() {
        System.out.println("车辆正处于开门状态，请勿重复施发命令!!!");
    }

    @Override
    public void closeDoor() {
        System.out.println("车门已关闭");
        context.setState(context.getStateCloseDoor());
    }

    @Override
    public void run() {
        System.out.println("车辆正处于开门状态，请先关门再运行!!!");
    }

    @Override
    public void stop() {
        System.out.println("车辆正处于开门状态，已是停止状态!!!");
    }
}
