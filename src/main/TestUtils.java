package main;

import builder.*;
import factory_abstract.CreateClothes;
import factory_abstract.FactoryCasual;
import factory_abstract.FactorySport;
import factory_method.FactoryFood;
import factory_method.FactoryWater;
import factory_method.IFactory;
import observer.ConcreteSubject;
import observer.IObserver;
import observer.ISubject;
import observer.ConcreteObserver;
import factory_simple.IProduct;
import factory_simple.ProductType;
import factory_simple.SimpleFactory;
import proxy_dynamic.InvocationHandlerImp;
import proxy_dynamic.RealRiceMaker;
import proxy_dynamic.IRiceMaker;
import proxy_static.Customer;
import proxy_static.IToyMaker;
import proxy_static.ToyMakerImp2;
import proxy_static.ToyMakerProxy;
import singleton.DoubleCheckSingleton;
import singleton.EnumSingleton;
import singleton.SingletonHolder;
import strategy.*;

import java.lang.reflect.Proxy;

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

    protected static void testFactoryMethod() {
        IFactory factoryFood = new FactoryFood();
        IFactory factoryWater = new FactoryWater();
        try {
            factory_method.IProduct productFood = factoryFood.
                    createProduct(factory_method.ProductType.PRODUCT_FOOT_CHICKEN);
            productFood.getProduct();
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            factory_method.IProduct productWater = factoryWater.
                    createProduct(factory_method.ProductType.PRODUCT_WATER_BITTER);
            productWater.getProduct();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    protected static void testFactoryAbstract() {
        factory_abstract.IFactory factoryCasual = new FactoryCasual();//休闲装
        factory_abstract.IFactory factorySport = new FactorySport();//运动装
        CreateClothes shapeColor = new CreateClothes(factorySport);
        shapeColor.printClothesInfo();
    }

    protected static void testProxy() {
        Customer customer = new Customer("李四");
        ToyMakerProxy proxy = new ToyMakerProxy();
        proxy.sellBarbie(customer);
        proxy.sellTeddy(customer);
        IToyMaker maker = new ToyMakerImp2("浩海生产者");
        proxy.setToyMaker(maker);
        proxy.sellTeddy(customer);
        proxy.sellBarbie(customer);
    }

    protected static void testProxyDynamic() {
        IRiceMaker riceMaker = new RealRiceMaker();
        InvocationHandlerImp invocationHandlerImp = new InvocationHandlerImp(riceMaker);
        IRiceMaker proxy = (IRiceMaker) Proxy.newProxyInstance(riceMaker.getClass().getClassLoader(), riceMaker.getClass().getInterfaces(), invocationHandlerImp);
        int quantity = proxy.makeRice(10);
        String riceName = proxy.getRiceName();
        System.out.println("客户:我最终买了" + quantity + "斤" + riceName);
    }

    protected static void testBuilder() {
        Director director;
        Product product;
        IBuilder<Product> builder;
        //建造房子
        builder = new HouseBuilder();
        director = new Director(builder);
        director.construct();
        product = builder.getResult();
        product.showInfo();
        //建造做饭
        builder = new CookBuilder();
        director = new Director(builder);
        director.construct();
        product = builder.getResult();
        product.showInfo();
    }
}
