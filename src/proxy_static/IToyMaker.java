package proxy_static;

/**
 * 玩具生产者接口
 * Created by zhangss on 2017/5/26.
 */
public interface IToyMaker {

    /**
     * 卖泰迪熊
     *
     * @param customer 消费者
     */
    void sellTeddy(Customer customer);

    /**
     * 出售芭比娃娃
     *
     * @param customer 消费者
     */
    void sellBarbie(Customer customer);
}
