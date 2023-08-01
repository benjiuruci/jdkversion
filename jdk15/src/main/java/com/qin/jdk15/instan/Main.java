package com.qin.jdk15.instan;

/**
 * @author qinxianzhong
 * @since 2023/7/28 17:23:39
 */
public class Main {

    public static void main(String[] args) {
        Object obj = "abc";

        /**
         * obj不需要强制转化为String类型可以直接使用
         */
        if(obj instanceof String str){
            System.out.println(str.length());
        }
    }
}
