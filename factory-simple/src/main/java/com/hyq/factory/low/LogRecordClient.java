package com.hyq.factory.low;

/**
 * 日志记录器：记录可能记录到本地硬盘、系统事件、远程服务器等，用户可以选择记录日志到什么地方。
 * <p>
 * Low逼版
 * Created by heyuqiu on 2018/12/13.
 */
public class LogRecordClient {

    public void addRecord(String logContent, Destination destination) {
        switch (destination) {
            case DISK:
                addDiskRecord(logContent);
                break;
            case SYSEVENT:
                addDiskRecord(logContent);
                break;
            case REMOTE:
                addDiskRecord(logContent);
                break;
        }
        System.out.println("addRecord done!");
    }

    private void addDiskRecord(String logContent) {
        System.out.println("addDiskRecord" + logContent);
    }

    private void addSysEventRecord(String logContent) {
        System.out.println("addSysEventRecord" + logContent);
    }

    private void addRemoteRecord(String logContent) {
        System.out.println("addRemoteRecord" + logContent);
    }
}
