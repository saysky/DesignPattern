package com.liuyanzhao.ch6;

/**
 * @author �ԕ�
 * @date 2020-01-12 15:01
 */
public class Usb implements IUsb {

    /**
     * �����ͺ�
     */
    private String name;

    @Override
    public void connect(String name) {
        System.out.println("�ɹ�����" + name);
    }
}
