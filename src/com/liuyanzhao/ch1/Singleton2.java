package com.liuyanzhao.ch1;

/**
 * ����ʽ���̰߳�ȫ
 * @author �ԕ�
 * @date 2020-01-09 14:48
 */

public class Singleton2 {

    /**
     * �������췽��Ϊ private ���ͣ�����ͨ�� new ����
     */
    private Singleton2() {
    }

    /**
     * �����ʼ��ʱ����ʵ��
     */
    private static Singleton2 singleton = new Singleton2();

    /**
     * �ṩ����Ψһ��ȡ����ķ���
     * @return
     */
    public static Singleton2 getSingleton() {
        return singleton;
    }
}
