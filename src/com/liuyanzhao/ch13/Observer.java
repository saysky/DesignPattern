package com.liuyanzhao.ch13;

/**
 * 抽象观察者
 * 定义了一个update()方法，当被观察者调用notifyObservers()方法时，观察者的update()方法会被回调。
 * @author 言曌
 * @date 2020-01-12 19:50
 */

public interface Observer {

    void update(String message);
}
