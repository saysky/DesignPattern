package com.liuyanzhao.ch4;


/**
 * @author ят∙в
 * @date 2020-01-11 22:38
 */

public class Employee implements Cloneable {

    private String name;

    private String salary;

    private String joinDate;

    private String job;


    @Override
    protected Employee clone() throws CloneNotSupportedException {
         return (Employee) super.clone();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getJoinDate() {
        return joinDate;
    }

    public void setJoinDate(String joinDate) {
        this.joinDate = joinDate;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }
}
