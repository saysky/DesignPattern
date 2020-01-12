package com.liuyanzhao.ch2.ch2_1;

/**
 * @author 言曌
 * @date 2020-01-09 17:35
 */

public class ComputerFactory {

    /**
     * 通过工厂创建产品
     * @param type
     * @return
     */
    public static Computer createComputer(String type) {
        Computer computer = null;
        switch (type) {
            case "lenovo":
                computer = new LenovoComputer();
                break;
            case "hp":
                computer = new HpComputer();
                break;
            case "asus":
                computer = new AsusComputer();
                break;
        }
        return computer;
    }
}
