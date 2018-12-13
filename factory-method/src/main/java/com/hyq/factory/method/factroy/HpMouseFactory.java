package com.hyq.factory.method.factroy;

import com.hyq.factory.method.mouse.HpMouse;
import com.hyq.factory.method.mouse.Mouse;

/**
 * Created by heyuqiu on 2018/12/13.
 */
public class HpMouseFactory implements MouseFactory {
    @Override
    public Mouse createMouse() {
        return new HpMouse();
    }
}
