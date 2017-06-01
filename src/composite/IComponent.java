package composite;

import java.util.List;

/**
 * 抽象构件角色：是组合中的对象声明接口
 * Created by zhangss on 2017/6/1.
 */
public interface IComponent {

    /**
     * 添加元素
     *
     * @param component
     */
    void add(IComponent component);

    /**
     * 删除元素
     *
     * @param component
     */
    void remove(IComponent component);

    /**
     * 获取子元素
     */
    List<IComponent> getChildren();

    /**
     * 获取节点名字
     *
     * @return
     */
    String getName();
}
