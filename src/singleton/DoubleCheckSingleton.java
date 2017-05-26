package singleton;

/**
 * 单例模式（双重检查）
 * Created by zhangss on 2017/5/25.
 */
public class DoubleCheckSingleton {

    private static volatile DoubleCheckSingleton doubleCheckSingleton;

    private DoubleCheckSingleton() {
    }

    public static DoubleCheckSingleton getDoubleCheckSingleton() {
        if (doubleCheckSingleton == null) {
            synchronized (DoubleCheckSingleton.class) {//加锁保证多线程模式下获取实例唯一
                if (doubleCheckSingleton == null) {
                    doubleCheckSingleton = new DoubleCheckSingleton();
                }
            }
        }
        return doubleCheckSingleton;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
