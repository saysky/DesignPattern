package com.liuyanzhao.ch2.ch2_3;

/**
 * @author 言曌
 * @date 2020-01-09 17:35
 */

public abstract class AbstractComputerFactory {

    /**
     * 创建台式机电脑
     * @return
     */
    public abstract DesktopComputer createDesktopComputer();

    /**
     * 创建笔记本电脑
     * @return
     */
    public abstract LaptopComputer createLaptopComputer();

}
