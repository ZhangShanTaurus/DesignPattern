package state;

/**
 * 上下文环境类:包括一些内部状态
 * Created by zhangss on 2017/6/2.
 */
public class Context {

    private ICarState state;
    private ICarState stateCloseDoor;//关门状态
    private ICarState stateOpenDoor;//开门状态
    private ICarState stateRun;//运行中
    private ICarState stateStop;//停止

    public Context() {
        stateCloseDoor = new StateCloseDoor(this);
        stateOpenDoor = new StateOpenDoor(this);
        stateRun = new StateRun(this);
        stateStop = new StateStop(this);
        this.state = stateStop;
    }

    public void openDoor() {
        state.openDoor();
    }

    public void closeDoor() {
        state.closeDoor();
    }

    public void run() {
        state.run();
    }

    public void stop() {
        state.stop();
    }


    //Getter
    public ICarState getStateCloseDoor() {
        return stateCloseDoor;
    }

    public ICarState getStateOpenDoor() {
        return stateOpenDoor;
    }

    public ICarState getStateRun() {
        return stateRun;
    }

    public ICarState getStateStop() {
        return stateStop;
    }

    public void setState(ICarState state) {
        this.state = state;
    }
}
