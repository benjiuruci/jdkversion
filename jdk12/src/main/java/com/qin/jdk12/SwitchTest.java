package com.qin.jdk12;

/**
 * 测试新版Switch
 *
 * Switch表达式允许在Switch语句中使用Lambda风格的语法进行模式匹配，并直接返回值
 *  在传统的Switch语句中，每个case分支都需要使用break语句来防止掉落到下一个分支。
 *  而在Switch表达式中，我们可以使用箭头(->)来直接返回值，而不需要使用break语句
 * @author qinxianzhong
 * @since 2023/7/27 14:30:56
 */
public class SwitchTest {
    public static void main(String[] args) {
        int day = 7;
        //switch可以直接返回值
        String dayName = switch(day){
            case 1, 2, 3, 4, 5 -> "上班";
            case 6, 7 -> "加班";
            default -> "休息";

        };
        System.out.println(dayName);

    }
}
