package singleton;

/**
 * 饿汉式单例
 * Created by zhangss on 2017/5/26.
 */
public class EagerSingleton {

    /**
     * 类加载时进行实例化单例对象，能保证多线程下实例唯一（线程安全）
     */
    private static final EagerSingleton singleton = new EagerSingleton();

    private EagerSingleton() {
    }

    public static EagerSingleton getSingleton() {
        return singleton;
    }
}
