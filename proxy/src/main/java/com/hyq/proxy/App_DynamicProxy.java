package com.hyq.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 静态代理总结:
 * 1.可以做到在不修改目标对象的功能前提下,对目标功能扩展.
 * 2.缺点:
 * <p>
 * 因为代理对象需要与目标对象实现一样的接口,所以会有很多代理类,类太多.同时,一旦接口增加方法,目标对象与代理对象都要维护.
 * 如何解决静态代理中的缺点呢?答案是可以使用动态代理方式
 * <p>
 * <p>
 * <p>
 * Created by heyuqiu on 2018/12/29.
 */
public class App_DynamicProxy {
    private volatile static int connectNum = 0;
    private static final int NUM_CLIENT_ALLOWED = 3;

    public static void main(String[] args) {
        IServerConnect serverConnect = new SupplierServerConnect();         // 被代理对象
        IServerConnect proxy = (IServerConnect) Proxy.newProxyInstance(serverConnect.getClass().getClassLoader(), serverConnect.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                if (connectNum < NUM_CLIENT_ALLOWED) {
                    method.invoke(serverConnect, args);
                    connectNum++;
                    System.out.println("supplier server proxy add client : " + args[0]);
                } else {
                    System.out.println(args[0] + " is not allowed to connect");
                }
                return null;
            }
        });
        proxy.connect("192.168.0.1");
        proxy.connect("192.168.0.2");
        proxy.connect("192.168.0.3");
        proxy.connect("192.168.0.4");
    }
}
