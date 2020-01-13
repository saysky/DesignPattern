package com.liuyanzhao.ch17;

/**
 * @author ят∙в
 * @date 2020-01-12 21:50
 */

public interface CredentialsMatcher {


    boolean doCredentialsMatch(String token, String info);

}
