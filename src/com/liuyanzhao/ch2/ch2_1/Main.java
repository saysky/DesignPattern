package com.liuyanzhao.ch2.ch2_1;

/**
 * ����
 *
 * @author �ԕ�
 * @date 2020-01-09 17:41
 */

public class Main {

    public static void main(String[] args) {
        Computer computer = ComputerFactory.createComputer("lenovo");
        computer.startup();
    }
}
