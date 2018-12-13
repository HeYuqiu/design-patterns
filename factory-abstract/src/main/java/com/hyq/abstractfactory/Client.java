package com.hyq.abstractfactory;


import com.hyq.abstractfactory.factroy.DellFactory;
import com.hyq.abstractfactory.factroy.HpFactory;
import com.hyq.abstractfactory.factroy.PcFactory;
import com.hyq.abstractfactory.keyboard.Keyboard;
import com.hyq.abstractfactory.mouse.Mouse;

/**
 * Created by heyuqiu on 2018/12/13.
 */
public class Client {
    public static void main(String[] args) {
        PcFactory dellFactory = new DellFactory();
        Keyboard dellKeyboard = dellFactory.createKeyboard();
        dellKeyboard.click();
        Mouse dellMouse = dellFactory.createMouse();
        dellMouse.sayHi();

        PcFactory hpFactory = new HpFactory();
        Keyboard hpKeyboard = hpFactory.createKeyboard();
        hpKeyboard.click();
        Mouse hpMouse = hpFactory.createMouse();
        hpMouse.sayHi();
    }
}
