package mediator;

/**
 * 抽象中介者
 * Created by zhangss on 2017/6/5.
 */
public interface Mediator {

    /**
     * 聊天
     *
     * @param colleagueA 同事A
     * @param colleagueB 同事B
     */
    void chat(AbsColleague colleagueA, AbsColleague colleagueB);

    /**
     * 添加同事
     *
     * @param colleague
     */
    void addColleague(AbsColleague colleague);

    /**
     * 通知其他同事
     *
     * @param colleague 发通知的同事
     * @param msg       发出的通知
     */
    void notify(AbsColleague colleague, String msg);
}
