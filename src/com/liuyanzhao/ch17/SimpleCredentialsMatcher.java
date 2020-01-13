package com.liuyanzhao.ch17;

import java.util.Objects;

/**
 * @author ят∙в
 * @date 2020-01-12 21:51
 */

public class SimpleCredentialsMatcher implements CredentialsMatcher {
    @Override
    public boolean doCredentialsMatch(String token, String info) {
        return Objects.equals(token, info);
    }
}
