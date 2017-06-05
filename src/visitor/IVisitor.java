package visitor;

/**
 * 抽象访问者:声明访问者可以访问哪些元素
 * Created by zhangss on 2017/6/5.
 */
public interface IVisitor {

    /**
     * 访问元素
     *
     * @param elementFood 元素
     */
    void visit(ElementFood elementFood);

    void visit(ElementDrink elementDrink);

}
