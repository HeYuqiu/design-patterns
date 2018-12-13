package com.hyq.abstractfactory.factroy;

import com.hyq.abstractfactory.keyboard.DellKeyboard;
import com.hyq.abstractfactory.keyboard.Keyboard;
import com.hyq.abstractfactory.mouse.DellMouse;
import com.hyq.abstractfactory.mouse.Mouse;

/**
 * Created by heyuqiu on 2018/12/13.
 */
public class DellFactory implements PcFactory {

    @Override
    public Mouse createMouse() {
        return new DellMouse();
    }

    @Override
    public Keyboard createKeyboard() {
        return new DellKeyboard();
    }
}
