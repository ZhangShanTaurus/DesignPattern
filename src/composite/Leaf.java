package composite;

import java.util.List;

/**
 * 树叶构件角色
 * Created by zhangss on 2017/6/1.
 */
public class Leaf implements IComponent {

    private String name;

    public Leaf(String name) {
        this.name = name;
    }

    @Deprecated
    @Override
    public void add(IComponent component) {
        try {
            throw new Exception("composite.Leaf can not add element");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Deprecated
    @Override
    public void remove(IComponent component) {
        try {
            throw new Exception("composite.Leaf can not remove element");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Deprecated
    @Override
    public List<IComponent> getChildren() {
        return null;
    }

    @Override
    public String getName() {
        return name;
    }
}
