package flyweight;

/**
 * 具体享元角色(单纯享元模式)
 * Created by zhangss on 2017/6/1.
 */
public class ConcreteFlyweight implements Flyweight {

    /**
     * 内蕴状态
     */
    private Direction direction;

    public ConcreteFlyweight(Direction direction) {
        this.direction = direction;
    }

    @Override
    public void operation(String info) {
        System.out.println("内蕴状态=" + direction + "\t 外蕴状态=" + info);
    }
}
