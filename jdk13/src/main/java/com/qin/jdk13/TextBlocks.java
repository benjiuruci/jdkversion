package com.qin.jdk13;

/**
 * jdk13 文本块测试
 * @author qinxianzhong
 * @since 2023/7/27 15:08:32
 */
public class TextBlocks {
    public static void main(String[] args) {

        /**
         * 最新文本块
         * 可以识别 特殊符合
         * 里面可以有引号
         * \s 空白符合也可以识别
         */
        String content = """
                内容内容 \
                  1234567778
                \s"123123"\
                adasdad
                
                """;
        System.out.println(content);
    }
}
