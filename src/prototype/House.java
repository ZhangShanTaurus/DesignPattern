package prototype;

import java.io.Serializable;

/**
 * 房子
 * Created by zhangss on 2017/5/31.
 */
public class House implements Cloneable ,Serializable{
    private static final long serialVersionUID = 242616631738131574L;

    private String address;//地址

    public House() {
    }

    public House(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public String toString() {
        return "House{" +
                "address='" + address + '\'' +
                '}';
    }
}
