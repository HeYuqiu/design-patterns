package com.hyq.proxy;

/**
 * java的动态代理有两种方式：JDK自带的Proxy和Cglib
 * JDK动态代理：底层基于反射机制进行方法调用，被代理类必须实现某个接口
 * CGLIB：代理类将委托类作为自己的父类，调用方法时，执行super(),非final的类和方法
 *
 * Spring AOP就是基于JDK动态代理 + CGLIB
 */
public class App_CglibProxy {
}
