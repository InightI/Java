package com.lx20191211;

import java.net.MalformedURLException;
import java.net.URL;

public class URLTest
{
    public static void main(String[] args) throws MalformedURLException {
        URL url = new URL("http://www.baidu.com:90/index.html?uname=saddsa&dsa=29#b");
        System.out.println("协议" + url.getProtocol());
        System.out.println("端口" + url.getPort());
        System.out.println("域名" + url.getHost());
        System.out.println("请求资源1" + url.getFile());
        System.out.println("请求资源2" + url.getPath());
        System.out.println("锚点" + url.getRef());
        System.out.println("参数" + url.getQuery());

    }
}
