package main;

import strategy.AddStrategy;
import strategy.DivStrategy;
import strategy.MultiStrategy;
import strategy.SubStrategy;

public class Main {

    public static void main(String[] args) {
//        TestUtils.testSingleton();
        TestUtils.testStrategy(new DivStrategy(), 10, 0);
    }
}
