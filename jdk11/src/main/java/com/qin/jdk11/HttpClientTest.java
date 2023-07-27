package com.qin.jdk11;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;
import java.util.concurrent.CompletableFuture;

/**
 * 测试新版HttpClient
 * Java自带HttpClient
 * @author qinxianzhong
 * @since 2023/7/25 17:49:34
 */
public class HttpClientTest {
    public static void main(String[] args) throws IOException, InterruptedException {

        HttpClient client = HttpClient.newBuilder()
                .connectTimeout(Duration.ofSeconds(20))
                .build();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://juejin.cn/post/7250734439709048869#heading-37"))
                .build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.statusCode());
        System.out.println(response.body());

    /*    //创建http客户端
        HttpClient client2 = HttpClient.newBuilder()
                .version(HttpClient.Version.HTTP_2)
                .build();

        //创建http请求
        HttpRequest request2 = HttpRequest.newBuilder()
                .uri(URI.create(""))
                .build()*/




    }
}
