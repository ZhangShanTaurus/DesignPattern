package strategy;

/**
 * 策略接口
 * Created by zhangss on 2017/5/26.
 */
@FunctionalInterface
public interface IStrategy {

    /**
     * 策略方法
     *
     * @param a 参数a
     * @param b 参数b
     * @return a与b计算后的结果
     */
    int getResult(int a, int b);
}
