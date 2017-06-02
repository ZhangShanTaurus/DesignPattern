package chain_of_responsibility;

/**
 * 低级请求
 * Created by zhangss on 2017/6/2.
 */
public class RequestLow extends AbstractRequest {

    public RequestLow(String content) {
        super(content);
    }

    @Override
    Level getRequestLevel() {
        return Level.LOW;
    }

}
