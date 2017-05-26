package singleton;

/**
 * 懒汉式单例
 * Created by zhangss on 2017/5/26.
 */
public class LazySingleton {

    private static LazySingleton singleton;

    private LazySingleton() {
    }

    /**
     * 该模式在多线程并发情况下不能保证实例唯一
     */
    public static LazySingleton getSingleton() {
        if (singleton == null) {
            singleton = new LazySingleton();
        }
        return singleton;
    }
}
