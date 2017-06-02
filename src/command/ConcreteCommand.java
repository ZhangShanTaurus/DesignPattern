package command;

/**
 * 具体命令:实现要执行的方法,它通常是"虚"的实现
 * Created by zhangss on 2017/6/2.
 */
public class ConcreteCommand implements ICommand {

    /**
     * 通常会有接收者，并调用接收者的功能来完成命令要执行的操作
     */
    private IReceiver receiver;

    public ConcreteCommand() {
    }

    public ConcreteCommand(IReceiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute(String command) {
        if (receiver != null) {
            receiver.action(command);
        }
    }

    public void setReceiver(IReceiver receiver) {
        this.receiver = receiver;
    }
}
