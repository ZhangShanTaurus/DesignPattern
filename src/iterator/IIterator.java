package iterator;

/**
 * 抽象迭代子
 * Created by zhangss on 2017/6/7.
 */
public interface IIterator {

    /**
     * 第一个
     */
    void first();

    /**
     * 最后一个
     */
    void last();

    /**
     * 下一个
     */
    Object next();

    /**
     * 是否还有下一个元素
     *
     * @return true:有
     */
    boolean hasNext();

    /**
     * 当前元素
     *
     * @return 当前元素
     */
    Object current();
}
