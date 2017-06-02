package template;

/**
 * 抽象类，定义模板方法
 * Created by zhangss on 2017/6/1.
 */
public abstract class AbstractClass {
    private static final String TAG = AbstractClass.class.getSimpleName();

    /**
     * 抽象方法
     */
    public abstract void onCreate();

    public abstract void onStart();

    public abstract void onResume();

    /**
     * 具体方法
     */
    public void onDestroy() {
        System.out.println(TAG + ":销毁");
    }

    /**
     * 钩子方法
     *
     * @return 是否销毁
     */
    public boolean isDestroy() {
        System.out.println(TAG + ":是否销毁 false");
        return false;
    }

    /**
     * 模板方法，定义算法骨架，算法具体细节由子类实现;
     * 子类可以不改变算法的结构即可重定义该算法中的某些特定步骤
     */
    public final void templateMethod() {
        onCreate();
        onStart();
        onResume();
        if (isDestroy()) {
            onDestroy();
        }
    }
}
