package com.hyq.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author Yuqiu.He
 * @date 2021/1/28
 */
public class JDKProxyText {
    public static void main(String[] args) {
        Impl p = new Impl();
        Test demo = (Test) Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(), Impl.class.getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("proxy say");
                method.invoke(p, args);
                return null;
            }
        });
        demo.say();
    }

    static class Impl implements Test {
        @Override
        public void say() {
            System.out.println("impl say");
        }

        @Override
        public void work() {
            System.out.println("impl work");
        }
    }

    interface Test {
        void say();

        void work();
    }
}
