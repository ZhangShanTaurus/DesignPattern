package singleton;

/**
 * 枚举单例
 * Created by zhangss on 2017/5/26.
 */
public enum EnumSingleton {
    INSTANCE {
        @Override
        public void read() {
            System.out.println("EnumSingleton  read()");
        }

        @Override
        public void write() {
            System.out.println("EnumSingleton  write()");
        }
    };

    public abstract void read();

    public abstract void write();
}
