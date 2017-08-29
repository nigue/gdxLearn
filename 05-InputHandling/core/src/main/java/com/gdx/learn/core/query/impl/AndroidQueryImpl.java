package com.gdx.learn.core.query.impl;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Peripheral;
import com.gdx.learn.core.query.QueryService;

public class AndroidQueryImpl implements QueryService {

    @Override
    public String loging() {

        String result = "";
        boolean hardwareKeyboard = Gdx.input.isPeripheralAvailable(Peripheral.HardwareKeyboard);
        boolean multiTouch = Gdx.input.isPeripheralAvailable(Peripheral.MultitouchScreen);
        
        result= "hardwareKeyboard: " + hardwareKeyboard + " multiTouch: " + multiTouch;
        return result;
    }

}
