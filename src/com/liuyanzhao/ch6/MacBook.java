package com.liuyanzhao.ch6;

/**
 * @author 言曌
 * @date 2020-01-12 14:54
 */
public class MacBook implements IMacBook {


    @Override
    public void connectDevice(TypeC typeC) {
        System.out.println("已连接外设");
    }
}
