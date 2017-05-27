package proxy_dynamic;

/**
 * 大米生产者接口
 * Created by zhangss on 2017/5/27.
 */
public interface IRiceMaker {

    /**
     * 生产大米
     *
     * @param quantity 数量（多少斤）
     */
    int makeRice(int quantity);

    /**
     * 获取大米的类型
     *
     * @return
     */
    String getRiceName();
}
