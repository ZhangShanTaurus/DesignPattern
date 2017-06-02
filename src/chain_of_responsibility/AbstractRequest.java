package chain_of_responsibility;

/**
 * 抽象请求类
 * Created by zhangss on 2017/6/2.
 */
public abstract class AbstractRequest {

    private String content;

    public AbstractRequest(String content) {
        this.content = content;
    }

    /**
     * 获取请求级别
     *
     * @return 请求级别
     */
    abstract Level getRequestLevel();

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
