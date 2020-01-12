package com.liuyanzhao.ch13;

/**
 * 抽象被观察者接口
 * 声明了添加、删除、通知观察者方法
 * @author 言曌
 * @date 2020-01-12 19:50
 */

public interface Observerable {

    void registerObserver(Observer o);

    void removeObserver(Observer o);

    void notifyObserver();
}
