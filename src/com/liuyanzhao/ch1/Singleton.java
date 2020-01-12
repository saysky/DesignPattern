package com.liuyanzhao.ch1;

/**
 * 懒汉式，线程不安全
 *
 * @author 言曌
 * @date 2020-01-09 14:48
 */

public class Singleton {

    /**
     * 声明构造方法为 private 类型，不能通过 new 创建
     */
    private Singleton() {
    }

    private static Singleton singleton = null;

    /**
     * 提供对外唯一获取对象的方法
     *
     * @return
     */
    public static Singleton getSingleton() {
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }


    /***********以下是三种解决线程安全问题的写法***************/

    /**
     * 1. 在方法上加锁  【不推荐】
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
     * 2. 双重检查(DCL) 【推荐】
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
     * 3. 静态内部类【推荐】
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
