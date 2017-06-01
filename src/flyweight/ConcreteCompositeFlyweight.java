package flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * 复合享元角色：（复合享元模式）不可共享
 * Created by zhangss on 2017/6/1.
 */
public class ConcreteCompositeFlyweight implements Flyweight {

    /**
     * 复合享元模式聚合了单纯享元角色
     */
    private Map<Direction, Flyweight> files = new HashMap<>();

    /**
     * 增加一个新的单纯享元对象到聚集中
     *
     * @param key   key
     * @param value value
     */
    public void addFlyweight(Direction key, Flyweight value) {
        files.put(key, value);
    }

    @Override
    public void operation(String info) {
        Flyweight flyweight;
        for (Direction o : files.keySet()) {
            flyweight = files.get(o);
            flyweight.operation(info);
        }
    }
}
