package com.hyq.factory.advance;

import com.hyq.factory.advance.Log.Destination;
import com.hyq.factory.advance.Log.LogBase;
import com.hyq.factory.advance.Log.LogFactory;

/**
 * Created by heyuqiu on 2018/12/13.
 */
public class Client {

    public static void main(String[] args) {
        Client client = new Client();
        client.addRecord("logContent",Destination.REMOTE);
    }

    public void addRecord(String logContent, Destination destination) {
        LogBase log = LogFactory.getLogInstance(destination);
        log.addLog(logContent);

        System.out.println("addRecord done!");
    }

}
