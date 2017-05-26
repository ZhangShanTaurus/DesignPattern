package observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 具体主题（被观察者）
 * Created by zhangss on 2017/5/26.
 */
public class ConcreteSubject implements ISubject {

    private List<IObserver> observerList;

    public ConcreteSubject() {
        observerList = new ArrayList<>();
    }

    @Override
    public void addObserver(IObserver observer) {
        if (observerList == null) {
            observerList = new ArrayList<>();
        }
        System.out.println("注册观察者" + observer.getName());
        observerList.add(observer);
    }

    @Override
    public void removeObserver(IObserver observer) {
        if (observerList.contains(observer)) {
            System.out.println("移除观察者" + observer.getName());
            observerList.remove(observer);
        } else {
            System.out.println(observer.getName() + "没有订阅该主题，移除失败");
        }
    }

    @Override
    public void notifyObserver(String msg) {
        System.out.println("主题变化了，通知观察者更新");
        for (IObserver observer : observerList) {
            observer.update(msg);
        }
    }
}
