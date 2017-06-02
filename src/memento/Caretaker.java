package memento;

import java.util.HashMap;
import java.util.Map;

/**
 * 管理角色：对备忘录进行管理，保存和提供备忘录。
 * Created by zhangss on 2017/6/2.
 */
public class Caretaker {

    /**
     * 使用Map保存备忘录对象
     */
    private Map<String, Memento> map = new HashMap<>();

    public Memento getMemento(String key) {
        return map.get(key);
    }

    public void setMemento(String key, Memento memento) {
        map.put(key, memento);
    }
}
