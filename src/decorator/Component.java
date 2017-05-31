package decorator;

/**
 * 组件对象接口
 * Created by zhangss on 2017/5/31.
 */
public interface Component {

    /**
     * 操作
     *
     * @param type 操作类型
     */
    void decorator(String type);
}
