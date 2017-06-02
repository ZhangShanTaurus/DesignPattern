package command;

/**
 * 真正执行命令的对象
 * Created by zhangss on 2017/6/2.
 */
public class ReceiverImp implements IReceiver {

    private String name;

    public ReceiverImp(String name) {
        this.name = name;
    }

    @Override
    public void action(String command) {
        System.out.println("我是" + name + ",收到命令:" + command + ",即刻执行");
    }
}
