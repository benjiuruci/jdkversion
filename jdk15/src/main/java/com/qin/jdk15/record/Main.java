package com.qin.jdk15.record;

/**
 * @author qinxianzhong
 * @since 2023/7/28 17:13:13
 */
public class Main {
    public static void main(String[] args) {
        User user = new User("小米",18);
        System.out.println(user.toString());
        System.out.println("是否未成年：" + user.minority());
    }
}



