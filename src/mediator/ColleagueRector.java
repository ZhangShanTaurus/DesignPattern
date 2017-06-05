package mediator;

/**
 * 校长
 * Created by zhangss on 2017/6/5.
 */
public class ColleagueRector extends AbsColleague {

    public ColleagueRector(String name,Mediator mediator) {
        super(name,mediator);
    }

    @Override
    public void receiveMessage(String msg) {
        System.out.println("我是" + name + ",收到消息:" + msg);
    }

    @Override
    public void talk() {
        System.out.println(msg);
    }
}
