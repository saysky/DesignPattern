package com.liuyanzhao.ch11;


import java.util.ArrayList;
import java.util.List;

/**
 * @author �ԕ�
 * @date 2020-01-12 15:41
 */

public class Main {

    public static void main(String[] args) {
        Organization root = new Organization("�ܲ�");
        List<Organization> rootChildList = new ArrayList<>();

        Organization guangdong = new Organization("�㶫�ֹ�˾");
        List<Organization> guangdongChildList = new ArrayList<>();
        guangdongChildList.add(new Organization("���ڷֹ�˾"));
        guangdongChildList.add(new Organization("���ݷֹ�˾"));
        guangdongChildList.add(new Organization("��ݸ�ֹ�˾"));
        guangdongChildList.add(new Organization("��ɽ�ֹ�˾"));
        guangdong.setChildOrganizationList(guangdongChildList);

        Organization zhejiang = new Organization("�㽭�ֹ�˾");

        rootChildList.add(guangdong);
        rootChildList.add(zhejiang);

        root.setChildOrganizationList(rootChildList);

        System.out.println(root);
    }
}
