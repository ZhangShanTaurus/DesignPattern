package chain_of_responsibility;

/**
 * 中级请求
 * Created by zhangss on 2017/6/2.
 */
public class RequestMiddle extends AbstractRequest {

    public RequestMiddle(String content) {
        super(content);
    }

    @Override
    Level getRequestLevel() {
        return Level.MIDDLE;
    }

}
