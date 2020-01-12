package com.liuyanzhao.ch2.ch2_2;

/**
 * @author �ԕ�
 * @date 2020-01-09 18:49
 */
public class HpComputerFactory extends AbstractComputerFactory {

    @Override
    public Computer createComputer() {
        return new HpComputer();
    }
}
