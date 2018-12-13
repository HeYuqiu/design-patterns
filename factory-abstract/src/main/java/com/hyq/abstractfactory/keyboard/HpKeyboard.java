package com.hyq.abstractfactory.keyboard;

/**
 * Created by heyuqiu on 2018/12/13.
 */
public class HpKeyboard implements Keyboard {
    @Override
    public void click() {
        System.out.println("HpKeyboard");
    }
}
