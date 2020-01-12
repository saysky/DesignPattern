package com.liuyanzhao.ch13;

import java.util.ArrayList;
import java.util.List;

/**
 * @author �ԕ�
 * @date 2020-01-12 19:51
 */

public class WechatServer implements Observerable {

    // ע�⵽���List���ϵķ��Ͳ���ΪObserver�ӿ�
    // ���ԭ������ӿڱ�̶���������ʵ�ֱ��
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
        System.out.println("΢�ŷ���������Ϣ�� " + s);
        //��Ϣ���£�֪ͨ���й۲���
        notifyObserver();
    }

}
