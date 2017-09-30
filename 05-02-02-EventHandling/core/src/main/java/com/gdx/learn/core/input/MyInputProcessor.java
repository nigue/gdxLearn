package com.gdx.learn.core.input;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.InputProcessor;

public class MyInputProcessor implements InputProcessor {

    @Override
    public boolean keyDown(int i) {
        Gdx.app.log("MyTag", "keyDown: " + i);
        return false;
    }

    @Override
    public boolean keyUp(int i) {
        Gdx.app.log("MyTag", "keyUp: " + i);
        return false;
    }

    @Override
    public boolean keyTyped(char c) {
        Gdx.app.log("MyTag", "keyTyped: ");
        return false;
    }

    @Override
    public boolean touchDown(int i, int i1, int i2, int i3) {
        Gdx.app.log("MyTag", "touchDown: ");
        return false;
    }

    @Override
    public boolean touchUp(int i, int i1, int i2, int i3) {
        Gdx.app.log("MyTag", "touchUp: ");
        return false;
    }

    @Override
    public boolean touchDragged(int i, int i1, int i2) {
        Gdx.app.log("MyTag", "touchDragged: ");
        return false;
    }

    @Override
    public boolean mouseMoved(int i, int i1) {
        Gdx.app.log("MyTag", "mouseMoved: ");
        return false;
    }

    @Override
    public boolean scrolled(int i) {
        Gdx.app.log("MyTag", "scrolled: ");
        return false;
    }

}
