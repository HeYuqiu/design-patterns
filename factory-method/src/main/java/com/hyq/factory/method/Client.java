package com.hyq.factory.method;

import com.hyq.factory.method.factroy.DellMouseFactory;
import com.hyq.factory.method.factroy.HpMouseFactory;
import com.hyq.factory.method.factroy.MouseFactory;
import com.hyq.factory.method.mouse.Mouse;

import javax.xml.bind.JAXBContext;
import java.text.NumberFormat;
import java.util.Calendar;

/**
 * Created by heyuqiu on 2018/12/13.
 */
public class Client {
    public static void main(String[] args) {
        MouseFactory hpMouseFactory = new HpMouseFactory();
        Mouse hpMouse = hpMouseFactory.createMouse();
        hpMouse.sayHi();

        MouseFactory dellMouseFactory = new DellMouseFactory();
        Mouse dellMouse = dellMouseFactory.createMouse();
        dellMouse.sayHi();
    }
}
