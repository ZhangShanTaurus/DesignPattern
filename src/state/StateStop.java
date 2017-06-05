package state;

/**
 * 停止状态
 * 停止状态下能开门，关门，运行
 * Created by zhangss on 2017/6/2.
 */
public class StateStop implements ICarState {

    private Context context;

    public StateStop(Context context) {
        this.context = context;
    }

    @Override
    public void openDoor() {
        System.out.println("车门已打开");
        context.setState(context.getStateOpenDoor());

    }

    @Override
    public void closeDoor() {
        System.out.println("车门已关闭");
        context.setState(context.getStateCloseDoor());
    }

    @Override
    public void run() {
        System.out.println("车辆已运行");
        context.setState(context.getStateRun());
    }

    @Override
    public void stop() {
        System.out.println("车辆正处于停止状态，请勿重复施发命令!!!");
    }
}
