package com.qin.jdk11;

import cn.hutool.core.getter.OptNullBasicTypeFromStringGetter;

/**
 * 测试新版Lambda表达式
 * @author qinxianzhong
 * @since 2023/7/27 10:25:59
 */
public class LambdaTest {

    public static void main(String[] args) {
        /**
         * Lambda表达式的参数可以使用var关键字来声明局部变量。
         * 使用var关键字可以让编译器根据上下文推断参数的类型。
         * 请注意，Lambda参数的类型推断只适用于局部变量，而不适用于方法的参数类型、返回类型或字段类型。
         */
        MyInterface myLambda = (var name,var age) ->{
            System.out.println("Name：" + name);
            System.out.println("Age：" + age);
        };


        myLambda.myMethod("qin",99);


    }


}

interface MyInterface{
    void myMethod(String name,Integer age);
    //var 不能应用与方法参数
//    void setName(var name);
}