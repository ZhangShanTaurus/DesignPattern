package decorator;

import java.util.ArrayList;
import java.util.List;

/**
 * 具体的组件对象，被装饰器装饰的原始对象，可以给这个对象添加职责
 * Created by zhangss on 2017/5/31.
 */
public class ConcreteComponent implements Component {

    private List<String> list = new ArrayList<>();

    @Override
    public void decorator(String type) {
        list.add(type);
        System.out.println("装饰信息:" + type);
    }

    /**
     * 展示装饰的信息
     */
    public void showOperation() {
        for (String s : list) {
            System.out.print(s + ",");
        }
    }
}
