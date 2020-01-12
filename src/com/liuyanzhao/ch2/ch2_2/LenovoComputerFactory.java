package com.liuyanzhao.ch2.ch2_2;


/**
 * @author ят∙в
 * @date 2020-01-09 18:49
 */
public class LenovoComputerFactory extends AbstractComputerFactory {

    @Override
    public Computer createComputer() {
        return new LenovoComputer();
    }
}
