package com.hyq.observer;

import java.util.List;

/**
 * Created by heyuqiu on 2019/1/9.
 */
public abstract class Watcher {
    protected List<String> clientIps;     // 客户端IP，如果获得节点监听事件，则用socket通过ip告诉客户端
    protected String nodePath;      // 所监听的节点路径
    protected EventType eventType; // 所监听的事件类型



    abstract void process();
}
