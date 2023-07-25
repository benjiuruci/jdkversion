package com.qin.model;

/**
 * 测试新版进程管理
 * @author qinxianzhong
 * @since 2023/7/24 11:10:09
 */
public class ProcessInfoTest {
    public static void main(String[] args) {
        //获取当前ProcessHandle
        ProcessHandle current = ProcessHandle.current();
        System.out.println("当前进程ID：" + current.pid());
        //获取当前进程info信息
        ProcessHandle.Info procesInfo = current.info();

        System.out.println("进程执行路径：" + procesInfo.command().orElse(null));
        System.out.println("命令行：" + procesInfo.commandLine().orElse(null));
        System.out.println("启动时间：" + procesInfo.startInstant().orElse(null));
        System.out.println("累计CPU时间：" + procesInfo.totalCpuDuration().orElse(null));
        System.out.println("进程用户：" + procesInfo.user().orElse(null));

        //父进程
        ProcessHandle parentProcess = current.parent().orElse(null);
        System.out.println("父进程ID:" + parentProcess.pid());
        //父进程info信息
        ProcessHandle.Info parentInfo = parentProcess.info();
        System.out.println("父进程执行路径：" + parentInfo.command());
    }
}
