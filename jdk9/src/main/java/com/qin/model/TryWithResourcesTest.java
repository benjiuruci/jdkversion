package com.qin.model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * 测试新版try-with-resources
 * @author qinxianzhong
 * @since 2023/7/24 15:32:17
 */
public class TryWithResourcesTest {
    public static void main(String[] args) {
        /**
         * try语句块中，我们可以使用reader对象读取文件的内容。
         * 当代码块结束时，无论是否发生异常，reader资源都会自动关闭。
         * 这样可以确保资源的正确释放，而无需显式调用close()方法。
         * 需要注意的是，try-with-resources语句可以处理多个资源，只需将它们用分号分隔即可。
         * 所有的资源都会在代码块结束时自动关闭，按照资源的声明顺序逆序关闭。
         *
         */
        try (BufferedReader reader = new BufferedReader(new FileReader("E:\\桌面\\test.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
