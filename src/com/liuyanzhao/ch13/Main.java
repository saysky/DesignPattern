package com.liuyanzhao.ch13;

/**
 * @author �ԕ�
 * @date 2020-01-12 19:53
 */

public class Main {

    public static void main(String[] args) {
        WechatServer server = new WechatServer();

        Observer zhangsan = new User("ZhangSan");
        Observer lisi = new User("LiSi");
        Observer wangwu = new User("WangWu");

        server.registerObserver(zhangsan);
        server.registerObserver(lisi);
        server.registerObserver(wangwu);


        server.sendInformation("PHP������������õ����ԣ�");
        System.out.println();

        // ����ȡ����ע
        server.removeObserver(zhangsan);
        server.sendInformation("JAVA������������õ����ԣ�");
    }
}
