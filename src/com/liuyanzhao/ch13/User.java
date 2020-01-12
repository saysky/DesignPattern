package com.liuyanzhao.ch13;

/**
 * @author 言曌
 * @date 2020-01-12 19:52
 */

public class User implements Observer {

    private String name;
    private String message;

    public User(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        this.message = message;
        read();
    }

    public void read() {
        System.out.println(name + " 收到推送消息： " + message);
    }

}
