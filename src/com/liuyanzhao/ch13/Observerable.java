package com.liuyanzhao.ch13;

/**
 * ���󱻹۲��߽ӿ�
 * ��������ӡ�ɾ����֪ͨ�۲��߷���
 * @author �ԕ�
 * @date 2020-01-12 19:50
 */

public interface Observerable {

    void registerObserver(Observer o);

    void removeObserver(Observer o);

    void notifyObserver();
}
