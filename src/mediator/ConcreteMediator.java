package mediator;

import java.util.ArrayList;
import java.util.List;

/**
 * 具体中介者
 * Created by zhangss on 2017/6/5.
 */
public class ConcreteMediator implements Mediator {

    private ColleagueSchoolmate schoolmate;//同学
    private ColleagueMonitor monitor;//班长
    private ColleagueTeacher teacher;//老师
    private ColleagueRector rector;//校长

    private List<AbsColleague> colleagueList = new ArrayList<>();

    @Override
    public void chat(AbsColleague colleagueA, AbsColleague colleagueB) {
        colleagueA.talk();
        colleagueB.talk();
    }

    @Override
    public void addColleague(AbsColleague colleague) {
        colleagueList.add(colleague);
    }

    @Override
    public void notify(AbsColleague colleague, String msg) {
        colleague.setMsg("我是" + colleague.getName() + ",发出消息:" + msg);
        colleague.talk();
        for (AbsColleague co : colleagueList) {
            if (co != colleague) {
                co.receiveMessage(msg);
            }
        }
    }

    public ColleagueSchoolmate getSchoolmate() {
        return schoolmate;
    }

    public void setSchoolmate(ColleagueSchoolmate schoolmate) {
        this.schoolmate = schoolmate;
    }

    public ColleagueMonitor getMonitor() {
        return monitor;
    }

    public void setMonitor(ColleagueMonitor monitor) {
        this.monitor = monitor;
    }

    public ColleagueTeacher getTeacher() {
        return teacher;
    }

    public void setTeacher(ColleagueTeacher teacher) {
        this.teacher = teacher;
    }

    public ColleagueRector getRector() {
        return rector;
    }

    public void setRector(ColleagueRector rector) {
        this.rector = rector;
    }
}
