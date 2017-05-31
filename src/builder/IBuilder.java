package builder;

/**
 * 抽象建造者接口，规范各个组成部分构建
 * Created by zhangss on 2017/5/31.
 */
public interface IBuilder<T> {

    /**
     * 建造A部分
     */
    void buildPartA();

    /**
     * 建造B部分
     */
    void buildPartB();

    /**
     * 建造B部分
     */
    void buildPartC();

    /**
     * 建造
     *
     * @return 建造对象结果
     */
    T getResult();
}
