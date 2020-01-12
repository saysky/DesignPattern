package com.liuyanzhao.ch3;

/**
 * @author 言曌
 * @date 2020-01-11 21:34
 */

public class Main {

    public static void main(String[] args) {
        // 不用建造者方式创建
        User user = new User("1", "zhangsan", "123456", "zhangsan@126.com");

        // 使用建造者方式
        User2 user2 = new User2.Builder()
                .userId("2")
                .username("saysky")
                .password("123456")
                .email("847064370@qq.com")
                .build();


    }
}
