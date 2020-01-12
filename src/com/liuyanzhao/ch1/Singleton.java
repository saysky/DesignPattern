package com.liuyanzhao.ch1;

/**
 * ����ʽ���̲߳���ȫ
 *
 * @author �ԕ�
 * @date 2020-01-09 14:48
 */

public class Singleton {

    /**
     * �������췽��Ϊ private ���ͣ�����ͨ�� new ����
     */
    private Singleton() {
    }

    private static Singleton singleton = null;

    /**
     * �ṩ����Ψһ��ȡ����ķ���
     *
     * @return
     */
    public static Singleton getSingleton() {
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }


    /***********���������ֽ���̰߳�ȫ�����д��***************/

    /**
     * 1. �ڷ����ϼ���  �����Ƽ���
     *
     * @return
     */
    public static synchronized Singleton getThreadSafeSingleton() {
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }

    /**
     * 2. ˫�ؼ��(DCL) ���Ƽ���
     *
     * @return
     */
    public static Singleton getThreadSafeSingleton2() {
        if (singleton == null) {
            synchronized (Singleton.class) {
                if (singleton == null) {
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }

    /**
     * 3. ��̬�ڲ��ࡾ�Ƽ���
     *
     * @return
     */
    private static class LazyHolder {
        private static final Singleton SINGLETON = new Singleton();
    }

    public static Singleton getThreadSafeSingleton3() {
        if (singleton == null) {
            singleton = new Singleton();
        }
        return LazyHolder.SINGLETON;
    }
}
