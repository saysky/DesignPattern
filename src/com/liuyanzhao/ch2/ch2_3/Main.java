package com.liuyanzhao.ch2.ch2_3;

/**
 * @author ят∙в
 * @date 2020-01-09 18:54
 */

public class Main {

    public static void main(String[] args) {

        LenovoComputerFactory lenovoComputerFactory = new LenovoComputerFactory();
        DesktopComputer lenovoComputer = lenovoComputerFactory.createDesktopComputer();
        lenovoComputer.startup();

    }
}
