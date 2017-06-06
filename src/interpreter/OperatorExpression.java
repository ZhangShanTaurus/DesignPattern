package interpreter;

/**
 * 终结符表达式，对应-、+
 * Created by zhangss on 2017/6/6.
 */
public class OperatorExpression implements Expression {

    @Override
    public void interpreter(Context context) {
        context.setOperator(context.current());//设置运算符
    }
}
