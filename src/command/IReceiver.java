package command;

/**
 * 命令接受者接口
 * Created by zhangss on 2017/6/2.
 */
public interface IReceiver {

    /**
     * 响应收到的命令
     *
     * @param command 命令
     */
    void action(String command);
}
