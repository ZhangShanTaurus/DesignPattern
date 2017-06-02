package chain_of_responsibility;

/**
 * 高级请求
 * Created by zhangss on 2017/6/2.
 */
public class RequestHigh extends AbstractRequest {

    public RequestHigh(String content) {
        super(content);
    }

    @Override
    Level getRequestLevel() {
        return Level.HIGH;
    }
}
