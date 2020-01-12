package com.liuyanzhao.ch6;

import java.util.ArrayList;
import java.util.List;

/**
 * @author �ԕ�
 * @date 2020-01-12 14:06
 */
class ArrayUtils {

    public static <T> List<T> asList(T... a) {
        List<T> list = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            list.add(a[i]);
        }
        return list;
    }
}

public class Example1 {

    public static void main(String[] args) {
        // ������ת��List
        String[] arr = {"����", "����", "����"};
        List<String> list = ArrayUtils.asList(arr);
        System.out.println(list);


    }
}
