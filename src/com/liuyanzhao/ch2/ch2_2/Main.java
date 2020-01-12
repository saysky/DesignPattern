package com.liuyanzhao.ch2.ch2_2;

/**
 * @author ят∙в
 * @date 2020-01-09 18:54
 */

public class Main {

    public static void main(String[] args) {

        LenovoComputerFactory lenovoComputerFactory = new LenovoComputerFactory();
        Computer lenovoComputer = lenovoComputerFactory.createComputer();
        lenovoComputer.startup();

    }
}
