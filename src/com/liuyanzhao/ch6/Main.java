package com.liuyanzhao.ch6;

/**
 * @author 言曌
 * @date 2020-01-12 14:35
 */
public class Main {

    public static void main(String[] args) {
        MacBook macBook = new MacBook();

        // 使用 TypeC 接口连接
        TypeC typeC = new TypeC();
        macBook.connectDevice(typeC);

        // 属于类的适配
        // 使用 USB 连接连接设备
        TypeCAdapter adapter = new TypeCAdapter();

        macBook.connectDevice(adapter);
    }
}