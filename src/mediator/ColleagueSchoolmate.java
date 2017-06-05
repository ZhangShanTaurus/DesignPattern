package mediator;

/**
 * 同学
 * Created by zhangss on 2017/6/5.
 */
public class ColleagueSchoolmate extends AbsColleague {

    public ColleagueSchoolmate(String name, Mediator mediator) {
        super(name, mediator);
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
