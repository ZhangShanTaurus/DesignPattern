package proxy_dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 动态代理
 * Created by zhangss on 2017/5/27.
 */
public class InvocationHandlerImp implements InvocationHandler {

    private Object object;

    public InvocationHandlerImp(Object o) {
        super();
        object = o;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object o;
        if (method.getName().equals("makeRice")) {//制造大米
            System.out.println("代理对象:执行目标方法之前，做一些事情");
            o = method.invoke(object, args);
            System.out.println("代理对象:执行目标方法之后，做一些事情");
        } else {
            o = method.invoke(object, args);
        }
        return o;
    }

    /**
     * 参数是否合法
     *
     * @param objects 参数
     * @return
     */
    private boolean isLegal(Object[] objects) {
        if (objects != null) {
            for (Object obj : objects) {
                if (obj.equals(0)) {//如果有参数为0，不合法
                    System.out.println("参数不合法,方法参数不可以为:" + obj);
                    return false;
                }
            }
        }
        return true;
    }
}
