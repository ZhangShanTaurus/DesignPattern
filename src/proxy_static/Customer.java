package proxy_static;

/**
 * 消费者，用于购买玩具
 * Created by zhangss on 2017/5/27.
 */
public class Customer {

    String name;

    public Customer() {
    }

    public Customer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                '}';
    }
}
