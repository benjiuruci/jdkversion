package com.qin.model;

/**
 * 测试新版 Deprecated注解
 * @author qinxianzhong
 * @since 2023/7/24 15:37:06
 */
public class DeprecatedTest {

    /**
     * forRemoval属性，用于指示该元素是否被打算用于移除。
     * 设置forRemoval=true表示该元素将来会被移除，
     * 而设置forRemoval=false表示该元素被废弃但将保留。
     *
     *
     * since属性用于指定元素被废弃的版本。
     * 通过指定since属性，您可以明确说明从哪个版本开始该元素被废弃。
     */
    @Deprecated(since = "2.0",forRemoval = true)
    public void oldMethod(){
        System.out.println("旧的方法。。。");
    }


    @Deprecated(since = "2.0", forRemoval = false)
    public void deprecatedMethod() {
        System.out.println("废弃的方法...");
    }

    public static void main(String[] args) {
        DeprecatedTest stat = new DeprecatedTest();
        stat.oldMethod();
        stat.deprecatedMethod();
    }

}
