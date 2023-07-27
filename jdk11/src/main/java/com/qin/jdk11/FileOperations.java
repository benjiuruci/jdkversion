package com.qin.jdk11;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

/**
 * 新增文件操作方法
 * @author qinxianzhong
 * @since 2023/7/27 11:39:43
 */
public class FileOperations {

    public static void main(String[] args) throws Exception {
        String filePath = "example.txt";

        //文件写入，如果不存自动创建
        //StandardOpenOption 设置模式
        String content = "Hello，Files";
        Files.writeString(Path.of(filePath),content,StandardOpenOption.APPEND);




        //读取文件
        String fileContent = Files.readString(Path.of(filePath));
        System.out.println("文件内容：" + fileContent);

//        //逐行写入 追加
//        List<String> lines = List.of("Line 1", "Line 2", "Line 3");
//        Files.write(Path.of(filePath), lines, StandardOpenOption.APPEND);
//
        //逐行读取
        List<String> fileLines = Files.readAllLines(Path.of(filePath));
        for (String line: fileLines) {
            System.out.println("逐行读取:" + line);
        }
    }
}
