package com.qin.jdk11;

/**
 * 测试String新增的方法
 * @author qinxianzhong
 * @since 2023/7/27 10:58:20
 */
public class StringTest {

    public static void main(String[] args) {

        // 设置ZGC作为垃圾收集器
        //System.setProperty("java.vm.useZGC", "true");

        /**
         * 新增String.isBlank() 检查字符串中是否有空白字符串
         * 如果字符串是空白字符串（仅由空格、制表符、换行符等字符组成）
         */
        String str = "  ";
        System.out.println("是否为空：" + str.isBlank());

        /**
         * 该方法用于去除字符串的首尾空白字符。它返回一个新的字符串，其中去除了原始字符串的首尾空白字符。
         * 与trim()方法不同的是，strip()方法可以正确处理Unicode空白字符。
         */
        String str2 = "     name" + "张宇     ";
        System.out.println("去除首尾空白字符" + str2.strip() + "1");

        /**
         * stripLeading方法去除字符串的前导空白字符,返回一个新的字符串
         */
        System.out.println("去除字符串前导空白字符" + str2.stripLeading() + "1");

        /**
         * stripTrailing方法去除字符串的尾随空白字符串,返回一个新的字符串
         */
        System.out.println("去除字符串尾随空白字符：" + str2.stripTrailing() + "1");

        /**
         * repeat该方法用于重复字符串指定次数，并返回一个新的字符串。
         * 它接受一个整数参数count，指定要重复的次数。
         */
        String str3 = "测试1";
        System.out.println(str3.repeat(10));
    }

}
