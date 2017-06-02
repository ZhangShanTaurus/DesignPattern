package chain_of_responsibility;

/**
 * 低级请求处理者
 * Created by zhangss on 2017/6/2.
 */
public class HandlerLow extends AbstractHandler {

    @Override
    protected void handle(AbstractRequest request) {
        System.out.println("我是" + getHandleLevel() + "处理者，我处理了该请求:" + request.getContent() + "\n");
    }

    @Override
    protected Level getHandleLevel() {
        return Level.LOW;
    }
}
