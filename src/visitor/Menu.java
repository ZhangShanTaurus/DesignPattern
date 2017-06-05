package visitor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 数据结构:菜单
 * Created by zhangss on 2017/6/5.
 */
public class Menu {

    private List<IElement> elementList = new ArrayList<>();

    /**
     * 添加元素
     *
     * @param element 元素
     */
    public void addElement(IElement element) {
        elementList.add(element);
    }

    public void accept(IVisitor visitor) {
        for (IElement element : elementList) {
            element.accept(visitor);
        }
    }
}
