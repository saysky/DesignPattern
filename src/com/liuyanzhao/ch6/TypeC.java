package com.liuyanzhao.ch6;

/**
 * TypeC
 *
 * @author 言曌
 * @date 2020-01-12 14:54
 */

public class TypeC implements ITypeC {

    @Override
    public void connect(String name) {
        System.out.println("成功连接" + name);
    }
}
