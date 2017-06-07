package iterator;

/**
 * 抽象聚集类
 * Created by zhangss on 2017/6/7.
 */
public interface IAggregate {

    /**
     * 创建迭代子
     *
     * @return
     */
    IIterator createIterator();

    /**
     * 获取索引为index上的元素
     *
     * @param index 索引位置
     * @return
     */
    Object getElement(int index);

    /**
     * 元素总数量
     *
     * @return
     */
    int count();
}
