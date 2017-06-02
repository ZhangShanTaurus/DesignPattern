package command;

/**
 * 抽象命令:定义命令的接口,声明执行的方法
 * Created by zhangss on 2017/6/2.
 */
public interface ICommand {

    /**
     * 执行命令
     *
     * @param command 命令
     */
    void execute(String command);
}
