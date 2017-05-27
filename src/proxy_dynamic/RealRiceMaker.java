package proxy_dynamic;

/**
 * 真实对象
 * Created by zhangss on 2017/5/27.
 */
public class RealRiceMaker implements IRiceMaker {

    @Override
    public int makeRice(int quantity) {
        System.out.println("卖东北大米，买一送一啦");
        return quantity * 2;
    }

    @Override
    public String getRiceName() {
        System.out.println("我卖得是东北大米");
        return "东北大米";
    }
}
