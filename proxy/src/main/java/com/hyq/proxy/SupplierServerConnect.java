package com.hyq.proxy;

/**
 * Created by heyuqiu on 2018/12/29.
 */
public class SupplierServerConnect implements IServerConnect {
    @Override
    public void connect(String clientIp) {
        System.out.println("client:" + clientIp + " connected the supplier server");
    }
}
