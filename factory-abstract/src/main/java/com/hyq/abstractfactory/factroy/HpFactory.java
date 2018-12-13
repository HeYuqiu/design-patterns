package com.hyq.abstractfactory.factroy;


import com.hyq.abstractfactory.keyboard.HpKeyboard;
import com.hyq.abstractfactory.keyboard.Keyboard;
import com.hyq.abstractfactory.mouse.HpMouse;
import com.hyq.abstractfactory.mouse.Mouse;

/**
 * Created by heyuqiu on 2018/12/13.
 */
public class HpFactory implements PcFactory{

    @Override
    public Mouse createMouse() {
        return new HpMouse();
    }

    @Override
    public Keyboard createKeyboard() {
        return new HpKeyboard();
    }
}
