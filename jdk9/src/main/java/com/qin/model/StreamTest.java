package com.qin.model;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 测试stream
 * @author qinxianzhong
 * @since 2023/7/24 13:48:45
 */
public class StreamTest {

    public static void main(String[] args) {
        /**
         * takeWhile() 方法返回从流的开头开始的连续元素，直到遇到第一个不满足给定条件的元素。
         */
        List<Integer> list =  Stream.of(1,2,3,4,5,6,2,8,9)
                .takeWhile(n-> n < 4)
                .collect(Collectors.toList());
        System.out.println("takeWhile实例：" + list);


        /**
         * dropWhile() 方法返回从流的开头开始跳过满足给定条件的连续元素，直到遇到第一个不满足条件的元素。
         */
        List<Integer> list2 = Stream.of(1,8,2,7,3,4,5,6)
                .dropWhile(n -> n < 4)
                .collect(Collectors.toList());
        System.out.println("dropWhile实例：" + list2);


        /**
         * ofNullable() 它允许创建一个包含一个非空元素或空的Stream。
         * 如果提供的元素是非空的，将创建一个包含该元素的Stream；
         * 如果提供的元素为空，则创建一个空的Stream。
         */
        String name = null;
        List<String> names = Stream.ofNullable(name)
                .collect(Collectors.toList());
        System.out.println("ofNullable实例：" + names);

        /**
         * iterate() 方法的重载：Stream.iterate() 方法现在支持一个谓词（Predicate）作为第二个参数。
         * 这样，您可以定义在生成迭代元素时应该终止迭代的条件。
         */
        List<Integer> evenNumber = Stream.iterate(0, n -> n < 10, n -> n + 1)
                .collect(Collectors.toList());
        System.out.println("iterate重载实例：" + evenNumber);

        //Stream 接口中的新方法示例
        Stream.of("Java", "Python", "C++")
                .forEachOrdered(System.out::println); // 输出：Java Python C++

    }

}
