package com.gdx.learn.core.input;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.InputAdapter;

public class MyInputAdapter extends InputAdapter {

    @Override
    public boolean keyDown(int keycode) {

        Gdx.app.log("MyTagAdapter", "keyDown: keycode:" + keycode);
        return false;
    }

}
