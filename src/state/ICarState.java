package state;

/**
 * 抽象状态类:汽车的状态,定义了一个所有具体状态的共同接口，
 * 任何状态都实现这个相同的接口,状态之间就可以互相转换了
 * Created by zhangss on 2017/6/2.
 */
public interface ICarState {

    /**
     * 开门
     */
    void openDoor();

    /**
     * 关门
     */
    void closeDoor();

    /**
     * 运行中
     */
    void run();

    /**
     * 停止
     */
    void stop();

}
