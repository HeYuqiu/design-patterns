package com.hyq.proxy;

/**
 * Created by heyuqiu on 2018/12/29.
 */
public class App {
    public static void main(String[] args) {
        IServerConnect serverConnect = new SupplierServerConnect();         // 被代理对象
        ServerConnectProxy proxy = new ServerConnectProxy(serverConnect);   // 代理对象
        proxy.connect("192.168.0.1");
        proxy.connect("192.168.0.2");
        proxy.connect("192.168.0.3");
        proxy.connect("192.168.0.4");
    }
}
