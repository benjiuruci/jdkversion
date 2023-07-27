package com.qin.jdk11;

import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.FutureTask;

/**
 * 测试 CompletableFuture
 * @author qinxianzhong
 * @since 2023/7/26 15:07:26
 */
public class CompletableFutureTest {

    public static void main(String[] args) throws Exception {
        FutureTask<String> futureTask = new FutureTask<>(()->{
            Thread.sleep(2000);
            return UUID.randomUUID().toString();
        });

        new Thread(futureTask).start();
        CompletableFuture future = CompletableFuture.completedFuture(futureTask.get());
        System.out.println("uuid:" + future.get());
    }

}
