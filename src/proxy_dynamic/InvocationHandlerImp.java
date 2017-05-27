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
        System.out.println("执行目标方法之前，做一些事情");
        o = method.invoke(object, args);
        System.out.println(o.toString());
        System.out.println("执行目标方法之后，做一些事情");
        return o;
    }
}
