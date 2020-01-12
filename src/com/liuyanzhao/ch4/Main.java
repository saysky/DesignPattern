package com.liuyanzhao.ch4;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author 言曌
 * @date 2020-01-11 22:41
 */

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd");
        Employee employeeTemplate = new Employee();
        employeeTemplate.setSalary("20k");
        employeeTemplate.setJob("算法工程师");
        employeeTemplate.setJoinDate(sdf.format(new Date()));

        List<Employee> employeeList = new ArrayList<>();
        String[] employeeArr = {"张三", "李四", "王五", "小明", "小红"};
        for (int i = 0; i < employeeArr.length; i++) {
            Employee employee = employeeTemplate.clone();
            employee.setName(employeeArr[i]);

            employeeList.add(employee);
        }




    }
}
