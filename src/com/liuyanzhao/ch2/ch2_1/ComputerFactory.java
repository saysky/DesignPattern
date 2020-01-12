package com.liuyanzhao.ch2.ch2_1;

/**
 * @author �ԕ�
 * @date 2020-01-09 17:35
 */

public class ComputerFactory {

    /**
     * ͨ������������Ʒ
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
