package com.liuyanzhao.ch6;

import java.util.List;

/**
 * @author 言曌
 * @date 2020-01-12 14:06
 */

class User {
    private String username;
    private String password;
    private String email;

    public User(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

class Account {
    private String account;
    private String password;
    private String email;

    public Account(User user) {
        account = user.getUsername();
        password = user.getPassword();
        email = user.getEmail();
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

class AccountService {
    void login(Account account) {
        System.out.println("登录，用户名" + account.getAccount() + "，密码" + account.getPassword());
    }
}

public class Example2 {

    public static void main(String[] args) {
        AccountService accountService = new AccountService();
        User user = new User("zhangsan", "123456", "zhangsan@qq.com");

        // 对象适配
        Account account = new Account(user);
        accountService.login(account);
    }
}
