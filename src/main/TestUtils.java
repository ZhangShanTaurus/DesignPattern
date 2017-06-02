package main;

import adapter.AdapterClass;
import adapter.AdapterObj;
import adapter.Target;
import bridge.*;
import builder.*;
import chain_of_responsibility.*;
import command.*;
import composite.FakeUtil;
import decorator.*;
import facade.FacadeGoOut;
import facade.FacadeSleep;
import facade.IFacade;
import factory_abstract.CreateClothes;
import factory_abstract.FactoryCasual;
import factory_abstract.FactorySport;
import factory_method.FactoryFood;
import factory_method.FactoryWater;
import factory_method.IFactory;
import factory_simple.IProduct;
import factory_simple.ProductType;
import factory_simple.SimpleFactory;
import flyweight.Direction;
import flyweight.Flyweight;
import flyweight.FlyweightFactory;
import memento.Caretaker;
import memento.Originator;
import observer.ConcreteObserver;
import observer.ConcreteSubject;
import observer.IObserver;
import observer.ISubject;
import prototype.House;
import prototype.UserPrototype;
import proxy_dynamic.IRiceMaker;
import proxy_dynamic.InvocationHandlerImp;
import proxy_dynamic.RealRiceMaker;
import proxy_static.Customer;
import proxy_static.IToyMaker;
import proxy_static.ToyMakerImp2;
import proxy_static.ToyMakerProxy;
import singleton.DoubleCheckSingleton;
import singleton.EnumSingleton;
import singleton.SingletonHolder;
import strategy.*;
import template.AbstractClass;
import template.ConcreteClassA;
import template.ConcreteClassB;

import java.io.IOException;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;

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

    protected static void testPrototype() {
        testShallowPrototype();
        System.out.println();
        testDeepPrototype();
        System.out.println();
        testSerializePrototype();
    }

    protected static void testShallowPrototype() {
        House house = new House("北京");
        UserPrototype user = new UserPrototype("张三", 25, house);
        UserPrototype shallow = user.shallowClone();//浅拷贝
        System.out.println("测试浅拷贝");
        System.out.println("原型:   " + user.toString());
        System.out.println("浅拷贝: " + shallow.toString());
        System.out.println("更改浅拷贝对象属性");
        shallow.setAge(10);
        shallow.setName("李四");
        shallow.getHouse().setAddress("河北");
        System.out.println("原型:   " + user.toString());
        System.out.println("浅拷贝: " + shallow.toString());
        System.out.println("原型对象与浅拷贝对象的House对象是否相等:" + user.getHouse().equals(shallow.getHouse()));

    }

    protected static void testDeepPrototype() {
        House house = new House("北京");
        UserPrototype user = new UserPrototype("张三", 25, house);
        UserPrototype deep = user.deepCloneByClone();//深拷贝
        System.out.println("测试Cloneable方式的深拷贝");
        System.out.println("原型:   " + user.toString());
        System.out.println("深拷贝: " + deep.toString());
        System.out.println("更改深拷贝对象属性");
        deep.setAge(10);
        deep.setName("李四");
        deep.getHouse().setAddress("河北");
        System.out.println("原型:   " + user.toString());
        System.out.println("深拷贝: " + deep.toString());
        System.out.println("原型对象与深拷贝对象的House对象是否相等:" + user.getHouse().equals(deep.getHouse()));
    }

    protected static void testSerializePrototype() {
        House house = new House("北京");
        UserPrototype user = new UserPrototype("张三", 25, house);
        UserPrototype deep;//深拷贝
        try {
            deep = user.deepCloneBySerializable();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            System.out.println("拷贝失败，创建拷贝对象");
            deep = new UserPrototype("李四", 20, house);
        }
        System.out.println("测试Serializable方式的深拷贝");
        System.out.println("原型:   " + user.toString());
        System.out.println("深拷贝: " + deep.toString());
        System.out.println("更改深拷贝对象属性");
        deep.setAge(10);
        deep.setName("李四");
        deep.getHouse().setAddress("河北");
        System.out.println("原型:   " + user.toString());
        System.out.println("深拷贝: " + deep.toString());
        System.out.println("原型对象与深拷贝对象的House对象是否相等:" + user.getHouse().equals(deep.getHouse()));
    }

    protected static void testAdapter() {
        Target adapterClass = new AdapterClass();
        adapterClass.requestWater();
        adapterClass.requestAir();

        Target adapterObj = new AdapterObj();
        adapterObj.requestWater();
        adapterObj.requestAir();
    }

    protected static void testDecorator() {
        Component component = new ConcreteComponent();
        Decorator decorator;
        decorator = new DecoratorHair(component);//为组件进行装饰头发
        decorator.decorator();
        decorator = new DecoratorShoes(component);//为组件进行装饰鞋子
        decorator.decorator();
        decorator = new DecoratorCoat(decorator);//装饰器也可以装饰具体的装饰对象
        decorator.decorator();
        ((ConcreteComponent) component).showOperation();//展示装饰信息
    }

    protected static void testFacade() {
        IFacade facadeSleep = new FacadeSleep();
        facadeSleep.close();
        facadeSleep.open();
        IFacade facadeGoOut = new FacadeGoOut();
        facadeGoOut.close();
        facadeGoOut.open();
    }

    protected static void testBridge() {
        //使用毛笔在油画纸上画画
        AbstractionPaper oilPaintingPaper = new OilPaintingPaper();
        oilPaintingPaper.setImplementor(new BrushPaint());
        oilPaintingPaper.draw();
        //使用钢笔在A4纸上画画
        AbstractionPaper a4Pager = new A4Pager();
        a4Pager.setImplementor(new FountainPaint());
        a4Pager.draw();
    }


    public static void testComposite() {
        FakeUtil.addFakeData();
    }

    protected static void testFlyweight() {
        FlyweightFactory flyweightFactory = FlyweightFactory.getInstance();
        Flyweight flyweight1 = flyweightFactory.getFlyweight(Direction.EAST);
        flyweight1.operation("东方");
        Flyweight flyweight2 = flyweightFactory.getFlyweight(Direction.WEST);
        flyweight2.operation("西方");
        Flyweight flyweight3 = flyweightFactory.getFlyweight(Direction.WEST);
        flyweight3.operation("西方");
        System.out.println("单纯享元角色是否可以共享:" + (flyweight2 == flyweight3));

        List<Direction> directionList = new ArrayList<>();
        directionList.add(Direction.NORTH);
        directionList.add(Direction.SOUTH);
        Flyweight flyweight4 = flyweightFactory.getCompositeFlyweight(directionList);
        flyweight4.operation("复合对象:南方、北方");
        Flyweight flyweight5 = flyweightFactory.getCompositeFlyweight(directionList);
        flyweight5.operation("复合对象:南方、北方");
        System.out.println("复合享元角色是否可以共享:" + (flyweight4 == flyweight5));

        System.out.println("享元角色数量为:" + flyweightFactory.getFlyweightCount());
    }

    protected static void testTemplate() {
        AbstractClass abstractClass;
        abstractClass = new ConcreteClassA();
        abstractClass.templateMethod();
        System.out.println();
        abstractClass = new ConcreteClassB();
        abstractClass.templateMethod();
    }

    protected static void testChain() {
        // 创建指责链的所有节点
        AbstractHandler handlerLow = new HandlerLow();
        AbstractHandler handlerMiddle = new HandlerMiddle();
        AbstractHandler handlerHigh = new HandlerHigh();
        // 进行链的组装，即头尾相连，一层套一层
        handlerLow.setNextHandler(handlerMiddle);
        handlerMiddle.setNextHandler(handlerHigh);
        // 创建请求并提交到指责链中进行处理
        AbstractRequest requestLow = new RequestLow("低级请求");
        AbstractRequest requestMiddle = new RequestMiddle("中级请求");
        AbstractRequest requestHigh = new RequestHigh("高级请求");
        AbstractRequest requestNoLevel = new RequestNoLevel("无级别请求");
        // 每次提交都是从链头开始遍历
        handlerLow.handleRequest(requestLow);
        handlerLow.handleRequest(requestMiddle);
        handlerLow.handleRequest(requestHigh);
        handlerLow.handleRequest(requestNoLevel);
        handlerHigh.handleRequest(requestLow);
    }

    protected static void testCommand() {
        Invoke invoke = new Invoke();//命令调用者
        IReceiver receiver;//命令执行者
        ConcreteCommand command;//具体命令

        receiver = new ReceiverImp("热菜厨师");
        command = new ConcreteCommand();
        command.setReceiver(receiver);
        invoke.setCommand(command);
        invoke.executeCommand("炒热菜");

        receiver = new ReceiverImp("凉菜厨师");
        command = new ConcreteCommand();
        command.setReceiver(receiver);
        invoke.setCommand(command);
        invoke.executeCommand("拌凉菜");
    }

    protected static void testMemento() {
        Originator ori = new Originator();
        Caretaker caretaker = new Caretaker();
        ori.setName("张三");
        ori.setAge(25);
        ori.setAddress("河北");
        System.out.println("初始化状态:\n" + ori);

        caretaker.setMemento("001", ori.createMemento());
        ori.setName("李四");
        ori.setAge(30);
        ori.setAddress("北京");
        System.out.println("修改后状态:\n" + ori);

        ori.restoreMemento(caretaker.getMemento("001"));
        System.out.println("恢复后状态:\n" + ori);
    }
}
