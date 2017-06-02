package chain_of_responsibility;

/**
 * 无级别请求
 * Created by zhangss on 2017/6/2.
 */
public class RequestNoLevel extends AbstractRequest {

    public RequestNoLevel(String content) {
        super(content);
    }

    @Override
    Level getRequestLevel() {
        return Level.NONE;
    }
}
