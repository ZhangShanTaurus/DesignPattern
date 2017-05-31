package builder;


/**
 * 导演者角色，负责建造对象
 * Created by zhangss on 2017/5/31.
 */
public class Director {

    private IBuilder builder;

    public Director(IBuilder builder) {
        this.builder = builder;
    }

    /**
     * 建造部分模块
     */
    public void construct() {
        builder.buildPartA();
        builder.buildPartB();
        builder.buildPartC();
    }
}
