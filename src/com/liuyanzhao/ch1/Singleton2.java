package com.liuyanzhao.ch1;

/**
 * 饿汉式，线程安全
 * @author 言曌
 * @date 2020-01-09 14:48
 */

public class Singleton2 {

    /**
     * 声明构造方法为 private 类型，不能通过 new 创建
     */
    private Singleton2() {
    }

    /**
     * 在类初始化时创建实例
     */
    private static Singleton2 singleton = new Singleton2();

    /**
     * 提供对外唯一获取对象的方法
     * @return
     */
    public static Singleton2 getSingleton() {
        return singleton;
    }
}
