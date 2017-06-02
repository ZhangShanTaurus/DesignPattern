package template;

/**
 * 具体实现类A
 * Created by zhangss on 2017/6/2.
 */
public class ConcreteClassA extends AbstractClass {
    private static final String TAG = ConcreteClassA.class.getSimpleName();

    @Override
    public void onCreate() {
        System.out.println(TAG + ":创建");
    }

    @Override
    public void onStart() {
        System.out.println(TAG + ":开始");
    }

    @Override
    public void onResume() {
        System.out.println(TAG + ":获取焦点");
    }
}
