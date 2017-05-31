package prototype;

import java.io.IOException;

/**
 * 原型接口
 * Created by zhangss on 2017/5/31.
 */
public interface Prototype {

    /**
     * 浅拷贝
     *
     * @return
     * @throws CloneNotSupportedException
     */
    Object shallowClone() throws CloneNotSupportedException;

    /**
     * 深拷贝:通过Clone方式进行深拷贝
     *
     * @return
     */
    Object deepCloneByClone() throws CloneNotSupportedException;

    /**
     * 通过序列化实现深拷贝
     */
    Object deepCloneBySerializable() throws IOException, ClassNotFoundException;
}
