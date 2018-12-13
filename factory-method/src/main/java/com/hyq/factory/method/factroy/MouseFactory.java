package com.hyq.factory.method.factroy;

import com.hyq.factory.method.mouse.Mouse;

/**
 * Created by heyuqiu on 2018/12/13.
 * 抽象工厂和工厂方法的主要区别 就在这
 */
public interface MouseFactory {
    Mouse createMouse();
}
