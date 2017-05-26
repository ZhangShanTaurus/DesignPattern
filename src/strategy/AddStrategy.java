package strategy;

/**
 * 加法策略
 * Created by zhangss on 2017/5/26.
 */
public class AddStrategy implements IStrategy {
    @Override
    public int getResult(int a, int b) {
        System.out.println(a + "+" + b + "=" + (a + b));
        return a + b;
    }
}
