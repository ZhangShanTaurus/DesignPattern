package observer;

/**
 * 观察者接口
 * Created by zhangss on 2017/5/26.
 */
public interface IObserver {

    /**
     * 更新方法
     *
     * @param msg 消息
     */
    void update(String msg);

    /**
     * 获取观察者名字
     *
     * @return 观察者名字
     */
    String getName();
}
