package singleton;

/**
 * Created by zhangss on 2017/5/26.
 */
public class SingletonHolder {


    private SingletonHolder() {
    }

    public static SingletonHolder getInstance() {
        return Holder.singletonHolder;
    }

    private static class Holder {
        private static SingletonHolder singletonHolder;
        //使用静态块或者直接实例化都可以，保证线程安全
//        private static SingletonHolder singletonHolder=new SingletonHolder();

        static {
            singletonHolder = new SingletonHolder();
        }
    }
}
