package state;

/**
 * 运行状态
 * 运行状态下只能停止
 * Created by zhangss on 2017/6/2.
 */
public class StateRun implements ICarState {

    private Context context;

    public StateRun(Context context) {
        this.context = context;
    }

    @Override
    public void openDoor() {
        System.out.println("车辆正处于运行状态，请勿打开车门!!!");
    }

    @Override
    public void closeDoor() {
        System.out.println("车辆正处于运行状态，车门也处于关闭状态!!!");
    }

    @Override
    public void run() {
        System.out.println("车辆正处于运行状态，请勿重复施发命令!!!");
    }

    @Override
    public void stop() {
        System.out.println("车辆已停止");
        context.setState(context.getStateStop());
    }
}
