package com.liuyanzhao.ch2.ch2_3;



/**
 * ������Թ�����
 * @author �ԕ�
 * @date 2020-01-09 18:49
 */
public class LenovoComputerFactory extends AbstractComputerFactory {

    @Override
    public DesktopComputer createDesktopComputer() {
        return new LenovoDesktopComputer();
    }

    @Override
    public LaptopComputer createLaptopComputer() {
        return new LenovoLaptopComputer();
    }
}
