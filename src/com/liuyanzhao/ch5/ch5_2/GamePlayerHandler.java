package com.liuyanzhao.ch5.ch5_2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author �ԕ�
 * @date 2020-01-12 13:04
 */
public class GamePlayerHandler implements InvocationHandler {
    // ��������
    Class clazz = null;

    // �������ߵ�ʵ��
    Object obj = null;

    // ��Ҫ����˭
    public GamePlayerHandler(Object obj) {
        this.obj = obj;
    }

    // ���ñ�����ķ���
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = method.invoke(this.obj, args);
        return result;
    }
}
