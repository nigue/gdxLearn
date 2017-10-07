package com.gdx.learn.core;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.TextInputListener;

public class MyTextInputListener implements TextInputListener {

    @Override
    public void input(String arg0) {
        Gdx.app.log("MyTextInputListener", "input: " + arg0);
    }

    @Override
    public void canceled() {
        Gdx.app.log("MyTextInputListener", "canceled");
    }

}
