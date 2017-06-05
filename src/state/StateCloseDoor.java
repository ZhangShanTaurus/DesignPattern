package state;

/**
 * 具体状态类:关门状态,用于处理来自Context的请求
 * 关门状态下能开门、运行
 * Created by zhangss on 2017/6/2.
 */
public class StateCloseDoor implements ICarState {

    private Context context;

    public StateCloseDoor(Context context) {
        this.context = context;
    }

    @Override
    public void openDoor() {
        System.out.println("车门已打开");
        context.setState(context.getStateOpenDoor());
    }

    @Override
    public void closeDoor() {
        System.out.println("车辆正处于关门状态，请勿重复施发命令!!!");
    }

    @Override
    public void run() {
        System.out.println("车辆已运行");
        context.setState(context.getStateRun());
    }

    @Override
    public void stop() {
        System.out.println("车辆正处于关门状态，但未处于运行状态，请先运行!!!");
    }
}
