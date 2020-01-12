package com.liuyanzhao.ch13;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 言曌
 * @date 2020-01-12 19:51
 */

public class WechatServer implements Observerable {

    // 注意到这个List集合的泛型参数为Observer接口
    // 设计原则：面向接口编程而不是面向实现编程
    private List<Observer> observerList;

    private String message;

    public WechatServer() {
        observerList = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer o) {

        observerList.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        if (!observerList.isEmpty()) {
            observerList.remove(o);
        }
    }

    @Override
    public void notifyObserver() {
        for (Observer observer : observerList) {
            observer.update(message);
        }
    }

    public void sendInformation(String s) {
        this.message = s;
        System.out.println("微信服务推送消息： " + s);
        //消息更新，通知所有观察者
        notifyObserver();
    }

}
