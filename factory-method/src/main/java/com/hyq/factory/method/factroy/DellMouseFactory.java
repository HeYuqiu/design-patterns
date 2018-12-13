package com.hyq.factory.method.factroy;

import com.hyq.factory.method.mouse.DellMouse;
import com.hyq.factory.method.mouse.Mouse;

/**
 * Created by heyuqiu on 2018/12/13.
 */
public class DellMouseFactory implements MouseFactory {
    @Override
    public Mouse createMouse() {
        return new DellMouse();
    }
}
