package com.qin.jdk10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * 测试类型推断
 * @author qinxianzhong
 * @since 2023/7/25 17:11:47
 */
public class TypeInferenceTest {

    public static void main(String[] args) {
        /**
         * var 自动推断类型
         */
        var str = "你好";

        var list = new ArrayList<>();
        list.add("1");

        var map = new HashMap<String,Object>();
        map.put("name","秦献忠");


        var list2 = List.of("a","b","c");


        for (var string : list2){
            System.out.println("循环：" + string);
        }



        System.out.println("字符串：" + str);

        System.out.println("List集合：" + list.toString());

        System.out.println("Map集合：" + map.get("name"));


        //可以接受方法返回参数
        var name = getName();
        System.out.println(name);
    }

    public static String getName(){
        return "name";
    }



    //不能作为方法参数
    /*public void setName(var name){
        System.out.println(name);
    }
*/
}



