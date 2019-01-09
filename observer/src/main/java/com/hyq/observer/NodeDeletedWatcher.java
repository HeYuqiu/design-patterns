package com.hyq.observer;

import java.util.List;

/**
 * Created by heyuqiu on 2019/1/9.
 */
public class NodeDeletedWatcher extends Watcher {

    public NodeDeletedWatcher(List<String> clientIps, String nodePath) {
        this.eventType = EventType.NodeDeleted;
        this.clientIps = clientIps;
        this.nodePath = nodePath;
    }

    @Override
    public void process() {
        // 只管EventType = NodeDeleted
        System.out.println("节点：" + this.nodePath + " 发生删除，向所订阅的客户端发送socket消息");
        this.clientIps.forEach(clientIp -> System.out.println("向客户端：" + clientIp + "发送删除消息完毕"));
    }
}
