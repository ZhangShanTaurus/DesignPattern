package interpreter;

/**
 * 算数表达式：非终结符表达式
 * Created by zhangss on 2017/6/6.
 */
public class ArithmeticExpression implements Expression {

    private static final char ADD = '+';
    private static final char SUB = '-';

    public void interpreter(Context context) {
        context.setResult(getResult(context));//计算结果
        context.getOperateNumbers().clear();//清空操作数
        context.setLeftOperateNumber(context.getResult());//将结果压入左操作数
    }

    private int getResult(Context context) {
        int result = 0;
        switch (context.getOperator()) {
            case '+':
                result = context.getOperateNumbers().get(0) + context.getOperateNumbers().get(1);
                break;
            case '-':
                result = context.getOperateNumbers().get(0) - context.getOperateNumbers().get(1);
                break;
            default:
                break;
        }
        return result;
    }
}
