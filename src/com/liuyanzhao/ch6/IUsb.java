package com.liuyanzhao.ch6;

/**
 * USB接口
 * @author 言曌
 * @date 2020-01-12 14:49
 */
public interface IUsb {

    /**
     * 连接设备名称
     * @param name
     * @return
     */
    void connect(String name);
}
