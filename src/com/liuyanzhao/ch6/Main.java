package com.liuyanzhao.ch6;

/**
 * @author �ԕ�
 * @date 2020-01-12 14:35
 */
public class Main {

    public static void main(String[] args) {
        MacBook macBook = new MacBook();

        // ʹ�� TypeC �ӿ�����
        TypeC typeC = new TypeC();
        macBook.connectDevice(typeC);

        // �����������
        // ʹ�� USB ���������豸
        TypeCAdapter adapter = new TypeCAdapter();

        macBook.connectDevice(adapter);
    }
}