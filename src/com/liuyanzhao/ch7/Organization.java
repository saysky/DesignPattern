package com.liuyanzhao.ch7;

import java.util.List;

/**
 * @author ят∙в
 * @date 2020-01-12 15:40
 */

public class Organization {

    private String name;

    List<Organization> childOrganizationList;


    public Organization(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Organization> getChildOrganizationList() {
        return childOrganizationList;
    }

    public void setChildOrganizationList(List<Organization> childOrganizationList) {
        this.childOrganizationList = childOrganizationList;
    }
}
