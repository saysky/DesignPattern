package com.liuyanzhao.ch2.ch2_3;



/**
 * 联想电脑工厂类
 * @author 言曌
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
