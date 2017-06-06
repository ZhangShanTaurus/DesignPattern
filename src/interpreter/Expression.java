package interpreter;

/**
 * 抽象解释器
 * Created by zhangss on 2017/6/6.
 */
public interface Expression {

    /**
     * 解释
     *
     * @param context 运行时上下文
     */
    void interpreter(Context context);
}
