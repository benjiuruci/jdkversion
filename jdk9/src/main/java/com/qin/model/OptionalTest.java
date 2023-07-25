package com.qin.model;

import java.util.Optional;

/**
 * 测试新版Optional
 * @author qinxianzhong
 * @since 2023/7/25 16:33:07
 */
public class OptionalTest {
    public static void main(String[] args) {


        Optional<String> optionalValue = Optional.of("Hello");

        /**
         * ifPresentOrElse: 用于在Optional对象有值时执行一个操作，
         * 否则执行一个备选操作。这样可以避免使用传统的if-else语句来处理Optional对象的值。
         */
        optionalValue.ifPresentOrElse(
                value -> System.out.println("Value：" + value),
                () -> System.out.println("没有值")
        );

        /**
         * stream 用于将Optional对象转换为一个包含单个元素的Stream。
         * 如果Optional对象有值，则返回一个包含该值的Stream，否则返回一个空Stream。
         */
        optionalValue.stream().forEach(
                value -> System.out.println("Stream value:" + value)
        );

        /**
         * Optional.or()方法现在支持Supplier函数接口，
         * 用于提供备选值。如果Optional对象为空，
         * 则使用Supplier提供的备选值。
         */
        Optional<String> emptyOptional = Optional.empty();

        String result = emptyOptional.or(()->Optional.of("默认值"))
                .orElse("Fallback Value");

        System.out.println("Result：" + result);

    }
}
