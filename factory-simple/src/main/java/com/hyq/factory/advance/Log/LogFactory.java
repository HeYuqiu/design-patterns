package com.hyq.factory.advance.Log;

/**
 * Created by heyuqiu on 2018/12/13.
 */
public class LogFactory {
    public static LogBase getLogInstance(Destination destination) {
        switch (destination) {
            case DISK:
                return new DiskLog();
            case SYSEVENT:
                return new SysEventLog();
            case REMOTE:
                return new RemoteLog();
            default:
                return null;
        }
    }
}
