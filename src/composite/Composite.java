package composite;

import java.util.ArrayList;
import java.util.List;

/**
 * 树枝构件角色
 * Created by zhangss on 2017/6/1.
 */
public class Composite implements IComponent {
    private String name;

    private List<IComponent> componentList;

    public Composite(String name) {
        this.name = name;
        componentList = new ArrayList<>();
    }

    @Override
    public void add(IComponent component) {
        componentList.add(component);
    }

    @Override
    public void remove(IComponent component) {
        if (component != null && componentList.contains(component)) {
            componentList.remove(component);
        }
    }

    @Override
    public List<IComponent> getChildren() {
        return componentList;
    }

    @Override
    public String getName() {
        return name;
    }
}
