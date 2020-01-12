package com.liuyanzhao.ch3;

/**
 * @author ят∙в
 * @date 2020-01-11 21:33
 */

public class User2 {

    private String userId;

    private String username;

    private String password;

    private String email;


    public User2() {
    }

    private User2(Builder builder) {
        userId = builder.userId;
        username = builder.username;
        password = builder.password;
        email = builder.email;
    }
    public static final class Builder {
        private String userId;
        private String username;
        private String password;
        private String email;

        public Builder() {}

        public Builder userId(String val) {
            userId = val;
            return this;
        }
        public Builder username(String val) {
            username = val;
            return this;
        }
        public Builder password(String val) {
            password = val;
            return this;
        }
        public Builder email(String val) {
            email = val;
            return this;
        }
        public User2 build() {
            return new  User2(this);}
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
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
