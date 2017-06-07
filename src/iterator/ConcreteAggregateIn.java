package iterator;

/**
 * 具体聚集:使用内部迭代子
 * Created by zhangss on 2017/6/7.
 */
public class ConcreteAggregateIn implements IAggregate {

    /**
     * 数据集合
     */
    private Object[] dataArray;

    public ConcreteAggregateIn(Object[] dataArray) {
        this.dataArray = dataArray;
    }

    @Override
    public IIterator createIterator() {
        return new InnerIterator();
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

    private class InnerIterator implements IIterator {

        /**
         * 内部索引，记录当前迭代到的索引位置
         */
        private int index;

        /**
         * 记录当前聚集对象的大小
         */
        private int size;

        InnerIterator() {
            index = 0;
            size = dataArray.length;
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
            Object o = dataArray[index];
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
            if (index < size) {
                return dataArray[index];
            } else {
                return null;
            }
        }
    }
}
