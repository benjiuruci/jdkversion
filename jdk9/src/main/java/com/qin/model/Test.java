package com.qin.model;

import cn.hutool.core.collection.CollectionUtil;
import cn.hutool.core.convert.Convert;

import java.util.ArrayList;
import java.util.List;

/**
 * @author qinxianzhong
 * @since 2023/7/21 15:47:24
 */
public class Test {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(1);

        if (CollectionUtil.isNotEmpty(list)){
            System.out.println("1111111");
        }



    }
}
