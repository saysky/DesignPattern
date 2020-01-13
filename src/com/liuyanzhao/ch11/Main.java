package com.liuyanzhao.ch11;


import java.util.ArrayList;
import java.util.List;

/**
 * @author 言曌
 * @date 2020-01-12 15:41
 */

public class Main {

    public static void main(String[] args) {
        Organization root = new Organization("总部");
        List<Organization> rootChildList = new ArrayList<>();

        Organization guangdong = new Organization("广东分公司");
        List<Organization> guangdongChildList = new ArrayList<>();
        guangdongChildList.add(new Organization("深圳分公司"));
        guangdongChildList.add(new Organization("广州分公司"));
        guangdongChildList.add(new Organization("东莞分公司"));
        guangdongChildList.add(new Organization("中山分公司"));
        guangdong.setChildOrganizationList(guangdongChildList);

        Organization zhejiang = new Organization("浙江分公司");

        rootChildList.add(guangdong);
        rootChildList.add(zhejiang);

        root.setChildOrganizationList(rootChildList);

        System.out.println(root);
    }
}
