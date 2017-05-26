package strategy;

/**
 * 除法策略
 * Created by zhangss on 2017/5/26.
 */
public class DivStrategy implements IStrategy {
    @Override
    public int getResult(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException();
        }
        System.out.println(a + "/" + b + "=" + (a / b));
        return a / b;
    }
}
