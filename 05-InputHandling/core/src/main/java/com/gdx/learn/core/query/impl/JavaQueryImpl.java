package com.gdx.learn.core.query.impl;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.gdx.learn.core.query.QueryService;

public class JavaQueryImpl implements QueryService {

    @Override
    public String loging() {
        String result = "";
        boolean isPressed = Gdx.input.isKeyPressed(Input.Keys.A);
        if (isPressed) {
            result = "isPressed A: ";
        }
        return result;
    }
}
