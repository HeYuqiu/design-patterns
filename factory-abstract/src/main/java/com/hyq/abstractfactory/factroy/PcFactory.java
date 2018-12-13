package com.hyq.abstractfactory.factroy;

import com.hyq.abstractfactory.keyboard.Keyboard;
import com.hyq.abstractfactory.mouse.Mouse;

/**
 * Created by heyuqiu on 2018/12/13.
 * 抽象工厂和工厂方法的主要区别 就在这
 */
public interface PcFactory {
    Mouse createMouse();
    Keyboard createKeyboard();
}
