package visitor;

/**
 * 抽象元素:声明接受哪一类访问者访问
 * Created by zhangss on 2017/6/5.
 */
public interface IElement {

    /**
     * 获取元素名字（菜品名称）
     *
     * @return 名字
     */
    String getElementName();

    /**
     * 获取元素价格(菜品价格)
     *
     * @return 价格
     */
    double getElementPrice();

    /**
     * 接受拜访者
     *
     * @param visitor 拜访者
     */
    void accept(IVisitor visitor);

}
