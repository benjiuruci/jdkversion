package com.qin.jdk15.permits;

/**
 * 继承于Shape密封类可以再次将该类声明为sealed密封类
 * 必须使用permits声明它可以有那些类可以继承
 * @author qinxianzhong
 * @since 2023/7/28 16:50:46
 */
public sealed class Square extends Shape permits Rectangle  {


}
