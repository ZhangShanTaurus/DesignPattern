package singleton;

/**
 * 单例模式
 * Created by zhangss on 2017/5/25.
 */
public class Singleton {

    private static volatile Singleton singleton;

    private Singleton() {
    }

    public static Singleton getSingleton() {
        if (singleton == null) {
            synchronized (Singleton.class) {
                if (singleton == null) {
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
