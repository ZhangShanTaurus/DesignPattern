package iterator;

/**
 * 具体迭代子
 * Created by zhangss on 2017/6/7.
 */
public class ConcreteIterator implements IIterator {

    /**
     * 集合
     */
    private IAggregate aggregate;

    /**
     * 内部索引，记录当前迭代到的索引位置
     */
    private int index;

    /**
     * 记录当前聚集对象的大小
     */
    private int size;

    public ConcreteIterator(ConcreteAggregateOut aggregate) {
        this.aggregate = aggregate;
        index = 0;
        size = aggregate.count();
    }

    @Override
    public void first() {
        index = 0;
    }

    @Override
    public void last() {
        index = size - 1;
    }

    @Override
    public Object next() {
        Object o = current();
        if (index < size) {
            index++;
        }
        return o;
    }

    @Override
    public boolean hasNext() {
        return index < size - 1;
    }

    @Override
    public Object current() {
        return aggregate.getElement(index);
    }
}
