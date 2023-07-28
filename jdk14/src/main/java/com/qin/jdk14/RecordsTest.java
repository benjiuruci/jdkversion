package com.qin.jdk14;

/**
 *
 * ecords（记录类型）是JDK 14引入的一项新特性，它简化了创建不可变（immutable）数据对象的过程。
 * 通过使用record关键字，可以定义一个记录类型，该类型自动生成了一些标准的方法，
 * 如构造函数、getter方法、equals()、hashCode()和toString()等方法
 *
 * @author qinxianzhong
 * @since 2023/7/28 14:58:21
 */
public class RecordsTest {
    public static void main(String[] args) {
        Person person = new Person("小明",12);
        System.out.println("name：" + person.name);
        System.out.println("age：" + person.age);
        System.out.println("Person：" + person);

        User user = new User("校长",44);


        System.out.println("");
        School school = new School("洛坦小学","海上",1,person,user);

        /**
         * 单独引用需要加（）
         */
        System.out.println("SchoolName：" + school.name());
        System.out.println("SchoolAddress：" + school.address());
        System.out.println("SchoolPersonNumber：" + school.personNumber());
        System.out.println("SchoolPerson：" + school.person());
        System.out.println("School：" + school);
    }

    //自动生成 get、set方法
    public record Person(String name,Integer age) {}
}


