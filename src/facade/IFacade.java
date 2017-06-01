package facade;

/**
 * 抽象外观类，外观类也可以不使用抽象，但为了避免增加新的子系统对外观类进行修改，即违反了“开闭原则”，所以进行抽象。
 * 添加或删除新的子系统时，增加新的外观类来避免对原有外观类的更改。
 * Created by zhangss on 2017/6/1.
 */
public interface IFacade {

    /**
     * 打开
     */
    void open();

    /**
     * 关闭
     */
    void close();
}
