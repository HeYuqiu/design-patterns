package com.hyq.factory.advance.Log;

/**
 * Created by heyuqiu on 2018/12/13.
 */
public class SysEventLog implements LogBase {
    @Override
    public void addLog(String logContent) {
        System.out.println("addSysEventLog" + logContent);
    }
}
