package com.hyq.observer;

import java.util.List;

/**
 * Created by heyuqiu on 2019/1/9.
 */
public class NodeUpdatedWatcher extends Watcher {


    public NodeUpdatedWatcher(List<String> clientIps, String nodePath) {
        this.eventType = EventType.NodeUpdated;
        this.clientIps = clientIps;
        this.nodePath = nodePath;
    }

    @Override
    public void process() {
        // 只管EventType = NodeUpdated
        System.out.println("节点：" + this.nodePath + " 发生更新，向所订阅的客户端发送socket消息");
        this.clientIps.forEach(clientIp -> System.out.println("向客户端：" + clientIp + "发送更新消息完毕"));
    }
}
