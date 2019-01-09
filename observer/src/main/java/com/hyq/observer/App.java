package com.hyq.observer;

import java.util.Arrays;

/**
 * Created by heyuqiu on 2019/1/9.
 */
public class App {
    public static void main(String[] args) {
        ZookeeperServer server = new ZookeeperServer();

        // 客户端开始向服务端提交Watcher注册
        server.addWatcher(new NodeUpdatedWatcher(Arrays.asList("192.168.0.11", "192.168.0.12", "192.168.0.13"), "/hyq/UpNode"));
        server.addWatcher(new NodeDeletedWatcher(Arrays.asList("192.168.0.21", "192.168.0.22"), "/hyq/DelNode"));

        // 服务端发生了节点操作事件
        server.nodeCRUD("/hyq/UpNode", EventType.NodeUpdated);
        server.nodeCRUD("/hyq/DelNode", EventType.NodeDeleted);
        server.nodeCRUD("/hyq/ChildNode", EventType.ChildrenChanged);
    }
}
