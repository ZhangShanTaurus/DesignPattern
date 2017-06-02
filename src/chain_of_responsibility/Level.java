package chain_of_responsibility;

/**
 * 枚举级别
 * Created by zhangss on 2017/6/2.
 */
public enum Level {

    LOW(0),
    MIDDLE(1),
    HIGH(2),
    NONE(3);

    int level;

    private Level(int level) {
        this.level = level;
    }
}
