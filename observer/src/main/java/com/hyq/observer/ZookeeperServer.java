package com.hyq.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by heyuqiu on 2019/1/9.
 */
public class ZookeeperServer {

    private List<Watcher> watchers;

    public ZookeeperServer() {
        watchers = new ArrayList<>();
    }

    public void addWatcher(Watcher watcher) {
        this.watchers.add(watcher);
    }

    public void nodeCRUD(String path, EventType type) {
        System.out.println("节点：" + path + " 发生" + type + "操作，开始执行通知操作");
        notifyObservers(path, type);
    }

    private void notifyObservers(String path, EventType type) {
        // 先从Watcher里找出需要发送消息的
        watchers.stream()
                .filter(watcher -> watcher.nodePath.equals(path) && watcher.eventType == type)
                .forEach(watcher -> {
                    watcher.process();
                });
    }
}
