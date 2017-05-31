package builder;

import java.util.ArrayList;
import java.util.List;

/**
 * 具体产品
 * Created by zhangss on 2017/5/31.
 */
public class Product {

    /**
     * 产品各个部分
     */
    private List<String> parts = new ArrayList<>();

    /**
     * 添加某一部分
     *
     * @param part
     */
    public void addPart(String part) {
        parts.add(part);
    }

    /**
     * 展示建造后的信息
     */
    public void showInfo() {
        for (String s : parts) {
            System.out.println(s);
        }
    }

}
