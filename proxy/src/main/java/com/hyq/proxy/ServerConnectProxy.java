package com.hyq.proxy;

/**
 * Created by heyuqiu on 2018/12/29.
 */
public class ServerConnectProxy implements IServerConnect {
    private IServerConnect serverConnect;
    private volatile static int connectNum = 0;
    private static final int NUM_CLIENT_ALLOWED = 3;

    public ServerConnectProxy(IServerConnect serverConnect) {
        this.serverConnect = serverConnect;
    }

    @Override
    public void connect(String clientIp) {
        if (connectNum < NUM_CLIENT_ALLOWED) {
            this.serverConnect.connect(clientIp);
            connectNum++;
            System.out.println("supplier server proxy add client : " + clientIp);
        } else {
            System.out.println(clientIp + " is not allowed to connect");
        }
    }
}
