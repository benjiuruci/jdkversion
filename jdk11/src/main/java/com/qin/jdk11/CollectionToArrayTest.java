package com.qin.jdk11;

import java.util.ArrayList;
import java.util.List;

/**
 * 测试新版Collection.toArray重载方法
 * Collection接口新增了一个重载的toArray方法，用于将集合转换为数组。
 * @author qinxianzhong
 * @since 2023/7/27 10:47:03
 */
public class CollectionToArrayTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("北京");
        list.add("上海");
        list.add("广州");
        list.add("深圳");

        // 使用Collection.toArray方法转换为数组
        String[] array = list.toArray(String[]::new);


        for (String str:array){
            System.out.println(str);
        }



    }
}
