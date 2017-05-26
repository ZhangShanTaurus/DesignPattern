package main;

import singleton.DoubleCheckSingleton;
import singleton.EnumSingleton;
import singleton.SingletonHolder;

public class Main {

    public static void main(String[] args) {
        testSingleton();
    }

    private static void testSingleton() {
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
}
