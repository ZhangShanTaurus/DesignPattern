package strategy;

/**
 * 乘法策略
 * Created by zhangss on 2017/5/26.
 */
public class MultiStrategy implements IStrategy {

    @Override
    public int getResult(int a, int b) {
        System.out.println(a + "*" + b + "=" + (a * b));
        return a * b;
    }
}
