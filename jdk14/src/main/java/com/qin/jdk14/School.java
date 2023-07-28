package com.qin.jdk14;

/**
 * Records（记录类型）也可以直接创建
 * 可以直接使用class对象
 * @author qinxianzhong
 * @since 2023/7/28 15:08:26
 */
public record School(String name, String address, Integer personNumber,RecordsTest.Person person,User user){}
