package main;

import singleton.Singleton;

public class Main {

    public static void main(String[] args) {
        testSingleton();
    }

    private static void testSingleton() {
        Singleton singleton1 = Singleton.getSingleton();
        Singleton singleton2 = Singleton.getSingleton();
        System.out.println("singleTon1 = " + singleton1.toString());
        System.out.println("singleTon2 = " + singleton2.toString());
        System.out.println("singleTon1 = singleTon2 " + (singleton1 == singleton2));
    }
}
