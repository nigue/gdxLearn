package com.gdx.learn.core.query.impl;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.gdx.learn.core.query.QueryService;

public class JavaQueryImpl implements QueryService {

    @Override
    public String loging() {
        String result = "";
        if (Gdx.input.isKeyPressed(Input.Keys.A)) {
            result = result + "isPressed A";
        }
        if (Gdx.input.isTouched()) {
            result = result + "Mouse Pressed";
        }
        if (Gdx.input.justTouched()) {
            result = result + "Mouse realized";
        }
        if (Gdx.input.isButtonPressed(Input.Buttons.LEFT)){
            result = result + "Mouse_LEFT";
        }
        if (Gdx.input.isButtonPressed(Input.Buttons.RIGHT)){
            result = result + "Mouse_RIGHT";
        }
        return result;
    }
}
