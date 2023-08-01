package com.qin.jdk15.record;

/**
 * @author qinxianzhong
 * @since 2023/7/28 17:14:29
 */
public record User(@Override String name,Integer age) {



    //里面可以添加方法
    public boolean minority(){
        return age < 18;
    }

}
