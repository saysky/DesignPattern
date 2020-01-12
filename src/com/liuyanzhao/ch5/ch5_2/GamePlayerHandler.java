package com.liuyanzhao.ch5.ch5_2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author 言曌
 * @date 2020-01-12 13:04
 */
public class GamePlayerHandler implements InvocationHandler {
    // 被代理者
    Class clazz = null;

    // 被代理者的实例
    Object obj = null;

    // 我要代理谁
    public GamePlayerHandler(Object obj) {
        this.obj = obj;
    }

    // 调用被代理的方法
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = method.invoke(this.obj, args);
        return result;
    }
}
