package com.liuyanzhao.ch13;

/**
 * @author 言曌
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


        server.sendInformation("PHP是世界上最好用的语言！");
        System.out.println();

        // 张三取消关注
        server.removeObserver(zhangsan);
        server.sendInformation("JAVA是世界上最好用的语言！");
    }
}
