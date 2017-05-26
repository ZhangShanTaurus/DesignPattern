package strategy;

/**
 * 减法策略
 * Created by zhangss on 2017/5/26.
 */
public class SubStrategy implements IStrategy {

    @Override
    public int getResult(int a, int b) {
        System.out.println(a + "-" + b + "=" + (a - b));

        return a - b;
    }
}
