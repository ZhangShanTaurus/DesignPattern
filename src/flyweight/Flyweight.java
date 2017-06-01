package flyweight;

/**
 * 抽象享元角色
 * Created by zhangss on 2017/6/1.
 */
public interface Flyweight {

    /**
     * 操作
     *
     * @param info 信息（享元角色的外蕴状态）
     */
    void operation(String info);
}
