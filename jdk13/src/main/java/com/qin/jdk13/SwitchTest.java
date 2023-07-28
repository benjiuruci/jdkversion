package com.qin.jdk13;

/**
 * @author qinxianzhong
 * @since 2023/7/27 14:58:52
 */
public class SwitchTest {
    public static void main(String[] args) {

        //使用Switch表达式根据给定的day值返回对应的星期几名称。
        int day = 7;
        String dayName = switch (day) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            default -> "Invalid day";
        };
        System.out.println(dayName);


        /**
         * 表达式和语句的组合：
         *
         * 根据给定的day值返回对应的日期类型。如果是工作日（1-5），我们使用yield返回一个字符串值。
         * 如果是周末（6-7），我们首先打印一条消息，然后返回一个字符串值。
         */
        String dayType = switch (day) {
            case 1, 2, 3, 4, 5 -> {
                yield "Weekday";
            }
            case 6, 7 -> {
                System.out.println("It's a weekend!");  // 执行语句
                yield "Weekend";
            }
            default -> {
                yield "Invalid day";
            }
        };
        System.out.println(dayType);

        //表达式的返回类型推断
        String dayinference = switch (getDayCount()) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            default -> "Invalid day";
        };
        System.out.println(dayinference);

    }

    public static int getDayCount(){
        return 2;
    }
}
