package command;

/**
 * 命令调用者:要求命令对象执行请求
 * Created by zhangss on 2017/6/2.
 */
public class Invoke {

    private ICommand iCommand;

    public Invoke() {
    }

    public void setCommand(ICommand command) {
        this.iCommand = command;
    }

    /**
     * 执行命令
     *
     * @param command 命令
     */
    public void executeCommand(String command) {
        if (iCommand != null) {
            iCommand.execute(command);
        }
    }
}
