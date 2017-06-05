package mediator;

/**
 * 抽象同事类
 * Created by zhangss on 2017/6/5.
 */
public abstract class AbsColleague {

    protected String name;
    protected String msg;
    protected Mediator mediator;

    public AbsColleague(String name, Mediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }

    /**
     * 接收消息
     *
     * @param msg 消息
     * @return
     */
    public abstract void receiveMessage(String msg);

    /**
     * 说话
     */
    public abstract void talk();

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getName() {
        return name;
    }
}
