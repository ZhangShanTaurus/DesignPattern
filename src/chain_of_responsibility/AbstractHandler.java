package chain_of_responsibility;

/**
 * 抽象处理者类
 * Created by zhangss on 2017/6/2.
 */
public abstract class AbstractHandler {

    /**
     * 下一个处理者
     */
    private AbstractHandler nextHandler;

    /**
     * 处理消息
     */
    public void handleRequest(AbstractRequest request) {
        if (request.getRequestLevel().level <= getHandleLevel().level) {//如果当前处理者能处理该请求，则处理
            handle(request);
        } else {//否则下一个处理者处理
            System.out.println("我是" + getHandleLevel() + "处理者，我处理不了该请求:" + request.getContent() + "，请下一个处理者处理");
            if (getNextHandler() != null) {
                getNextHandler().handleRequest(request);
            } else {
                System.out.println("责任链中没有人能处理的了该请求 \n");
            }
        }
    }

    /**
     * 获取能够处理请求的级别
     *
     * @return
     */
    protected abstract Level getHandleLevel();

    /**
     * 处理请求
     *
     * @param request 请求
     */
    protected abstract void handle(AbstractRequest request);

    public AbstractHandler getNextHandler() {
        return nextHandler;
    }

    public void setNextHandler(AbstractHandler nextHandler) {
        this.nextHandler = nextHandler;
    }
}
