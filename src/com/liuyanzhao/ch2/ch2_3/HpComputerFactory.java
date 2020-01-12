package com.liuyanzhao.ch2.ch2_3;



/**
 * ���յ��Թ�����
 * @author �ԕ�
 * @date 2020-01-09 18:49
 */
public class HpComputerFactory extends AbstractComputerFactory {

    @Override
    public DesktopComputer createDesktopComputer() {
        return new HpDesktopComputer();
    }

    @Override
    public LaptopComputer createLaptopComputer() {
        return new HpLaptopComputer();
    }
}
