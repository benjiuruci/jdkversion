package com.qin.model;

import java.util.List;
import java.util.Set;

/**
 * @author qinxianzhong
 * @since 2023/7/21 17:39:05
 */
public class TestArray {
    public static void main(String[] args) {
        //集合工厂
        //List.of() 方法用于创建不可变的列表对象.例如
        List<String> list = List.of("q","x");

        list.remove(1);

        //Set.of 方法用于创建不可以列表对象
        Set<Integer> set = Set.of(1,2,3);



    }
}
