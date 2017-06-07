package iterator;

/**
 * 具体聚集:使用外部迭代子
 * Created by zhangss on 2017/6/7.
 */
public class ConcreteAggregateOut implements IAggregate {

    /**
     * 数据集合
     */
    private Object[] dataArray;

    public ConcreteAggregateOut(Object[] dataArray) {
        this.dataArray = dataArray;
    }

    @Override
    public IIterator createIterator() {
        return new ConcreteIterator(this);
    }

    @Override
    public Object getElement(int index) {
        if (index < dataArray.length) {
            return dataArray[index];
        } else {
            return null;
        }
    }

    @Override
    public int count() {
        return dataArray.length;
    }
}
