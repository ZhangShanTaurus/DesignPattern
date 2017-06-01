package flyweight;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 享元角色工厂类，负责管理与创建享元角色
 * Created by zhangss on 2017/6/1.
 */
public class FlyweightFactory {

    private Map<Direction, Flyweight> map = new HashMap<>();
    /**
     * 享元工厂设为单例模式
     */
    private static FlyweightFactory flyweightFactory = new FlyweightFactory();

    private FlyweightFactory() {
    }

    public static FlyweightFactory getInstance() {
        return flyweightFactory;
    }

    /**
     * 获取单纯享元角色
     *
     * @param direction 享元角色的内蕴状态
     * @return 享元角色
     */
    public Flyweight getFlyweight(Direction direction) {
        Flyweight flyweight;
        flyweight = map.computeIfAbsent(direction, d -> new ConcreteFlyweight(d));
        return flyweight;
    }

    /**
     * 获取复合享元角色
     *
     * @param list 享元角色的内蕴状态集合
     * @return 享元角色
     */
    public Flyweight getCompositeFlyweight(List<Direction> list) {
        ConcreteCompositeFlyweight compositeFlyweight = new ConcreteCompositeFlyweight();
        for (Direction direction : list) {
            compositeFlyweight.addFlyweight(direction, getFlyweight(direction));
        }
        return compositeFlyweight;
    }

    /**
     * 获取存储的享元角色数量
     *
     * @return
     */
    public int getFlyweightCount() {
        return map.size();
    }
}
