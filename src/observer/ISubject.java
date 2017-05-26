package observer;

/**
 * 抽象主题
 * Created by zhangss on 2017/5/26.
 */
public interface ISubject {

    /**
     * 添加观察者
     *
     * @param observer 观察者
     */
    void addObserver(IObserver observer);

    /**
     * 移除观察者
     *
     * @param observer 观察者
     */
    void removeObserver(IObserver observer);

    /**
     * 通知观察者更新
     *
     * @param msg 更新消息
     */
    void notifyObserver(String msg);
}
