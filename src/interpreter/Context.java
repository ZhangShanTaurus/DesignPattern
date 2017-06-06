package interpreter;

import java.util.ArrayList;
import java.util.List;

/**
 * 上下文环境
 * Created by zhangss on 2017/6/6.
 */
public class Context {

    /**
     * 运算结果
     */
    private int result;

    /**
     * 当前位置
     */
    private int index;

    /**
     * 标志位
     */
    private int mark;

    /**
     * 输入的字符数组
     */
    private char[] inputChars;

    /**
     * 操作数
     */
    private List<Integer> operateNumbers = new ArrayList<>(2);

    /**
     * 运算符
     */
    private char operator;

    public Context(char[] inputChars) {
        super();
        this.inputChars = inputChars;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    public boolean hasNext() {
        return index != inputChars.length;
    }

    public char next() {
        return inputChars[index++];
    }

    public char current() {
        return inputChars[index];
    }

    public List<Integer> getOperateNumbers() {
        return operateNumbers;
    }

    public void setLeftOperateNumber(int operateNumber) {
        this.operateNumbers.add(0, operateNumber);
    }

    public void setRightOperateNumber(int operateNumber) {
        this.operateNumbers.add(1, operateNumber);
    }

    public char getOperator() {
        return operator;
    }

    public void setOperator(char operator) {
        this.operator = operator;
    }

    public void mark() {
        mark = index;
    }

    public void reset() {
        index = mark;
    }
}
