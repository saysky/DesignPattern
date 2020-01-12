package com.liuyanzhao.ch2.ch2_3;

/**
 * @author �ԕ�
 * @date 2020-01-09 17:35
 */

public abstract class AbstractComputerFactory {

    /**
     * ����̨ʽ������
     * @return
     */
    public abstract DesktopComputer createDesktopComputer();

    /**
     * �����ʼǱ�����
     * @return
     */
    public abstract LaptopComputer createLaptopComputer();

}
