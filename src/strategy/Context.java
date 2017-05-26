package strategy;

import com.sun.istack.internal.NotNull;

/**
 * Context上下文，持有IStrategy引用
 * Created by zhangss on 2017/5/26.
 */
public class Context {

    private IStrategy strategy;

    public Context(@NotNull IStrategy strategy) {
        this.strategy = strategy;
    }

    public int getResult(int a, int b) {
        int result = 0;
        if (strategy != null) {
            try {
                result = strategy.getResult(a, b);
            } catch (ArithmeticException e) {
                e.printStackTrace();
                System.out.println("除数不能为0!!!");
            }
        }
        return result;
    }
}
