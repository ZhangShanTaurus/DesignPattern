package main;

import observer.ConcreteSubject;
import observer.IObserver;
import observer.ISubject;
import observer.ConcreteObserver;
import simple_factory.IProduct;
import simple_factory.ProductType;
import simple_factory.SimpleFactory;
import singleton.DoubleCheckSingleton;
import singleton.EnumSingleton;
import singleton.SingletonHolder;
import strategy.*;

/**
 * 测试工具类
 * Created by zhangss on 2017/5/26.
 */
public class TestUtils {

    protected static void testSingleton() {
        System.out.println("双重检查单例测试：");
        DoubleCheckSingleton doubleCheckSingleton1 = DoubleCheckSingleton.getDoubleCheckSingleton();
        DoubleCheckSingleton doubleCheckSingleton2 = DoubleCheckSingleton.getDoubleCheckSingleton();
        System.out.println("singleTon1 = " + doubleCheckSingleton1.toString());
        System.out.println("singleTon2 = " + doubleCheckSingleton2.toString());
        System.out.println("singleTon1 = singleTon2 " + (doubleCheckSingleton1 == doubleCheckSingleton2));
        System.out.println();
        System.out.println("枚举单例测试：");
        System.out.println("singleTon1 = " + EnumSingleton.INSTANCE.toString());
        System.out.println("singleTon2 = " + EnumSingleton.INSTANCE.toString());
        EnumSingleton.INSTANCE.read();
        EnumSingleton.INSTANCE.write();
        System.out.println();
        System.out.println("Holder单例测试：");
        SingletonHolder holder1 = SingletonHolder.getInstance();
        SingletonHolder holder2 = SingletonHolder.getInstance();
        System.out.println("singleTon1 = " + holder1.toString());
        System.out.println("singleTon2 = " + holder2.toString());
        System.out.println("singleTon1 = singleTon2 " + (holder1 == holder2));
        System.out.println();
    }

    static void testStrategy(int a, int b) {
        IStrategy addStrategy = new AddStrategy();
        IStrategy subStrategy = new SubStrategy();
        IStrategy multiStrategy = new MultiStrategy();
        IStrategy divStrategy = new DivStrategy();
        Context context = new Context(addStrategy);
        int result = context.getResult(a, b);
    }

    protected static void testObserver(String msg) {
        ISubject subject = new ConcreteSubject();
        IObserver zhangSan = new ConcreteObserver("张三");
        IObserver lisi = new ConcreteObserver("李四");
        IObserver wangwu = new ConcreteObserver("王五");
        subject.addObserver(zhangSan);//注册观察者
        subject.addObserver(lisi);
        subject.addObserver(wangwu);
        subject.notifyObserver(msg);//通知观察者
        subject.removeObserver(wangwu);//移除观察者
        subject.notifyObserver(msg);
    }

    protected static void testSimpleFactory() {
        SimpleFactory factory = new SimpleFactory();
        try {
            IProduct product = factory.getProduct(ProductType.PRODUCT_D);
            product.getProduct();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
