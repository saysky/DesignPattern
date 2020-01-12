package com.liuyanzhao.ch6;

/**
 * @author 言曌
 * @date 2020-01-12 15:01
 */
public class Usb implements IUsb {

    /**
     * 自身型号
     */
    private String name;

    @Override
    public void connect(String name) {
        System.out.println("成功连接" + name);
    }
}
