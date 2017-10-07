package com.gdx.learn.core;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.input.GestureDetector.GestureListener;
import com.badlogic.gdx.math.Vector2;

public class MyGestureListener implements GestureListener {

    @Override
    public boolean touchDown(float arg0, float arg1, int arg2, int arg3) {
        Gdx.app.log("GestureListener", "touchDown");
        return false;
    }

    @Override
    public boolean tap(float arg0, float arg1, int arg2, int arg3) {
        Gdx.app.log("GestureListener", "tap");
        return false;
    }

    @Override
    public boolean longPress(float arg0, float arg1) {
        Gdx.app.log("GestureListener", "longPress");
        return false;
    }

    @Override
    public boolean fling(float arg0, float arg1, int arg2) {
        Gdx.app.log("GestureListener", "fling");
        return false;
    }

    @Override
    public boolean pan(float arg0, float arg1, float arg2, float arg3) {
        Gdx.app.log("GestureListener", "pan");
        return false;
    }

    @Override
    public boolean panStop(float arg0, float arg1, int arg2, int arg3) {
        Gdx.app.log("GestureListener", "panStop");
        return false;
    }

    @Override
    public boolean zoom(float arg0, float arg1) {
        Gdx.app.log("GestureListener", "zoom");
        return false;
    }

    @Override
    public boolean pinch(Vector2 arg0, Vector2 arg1, Vector2 arg2, Vector2 arg3) {
        Gdx.app.log("GestureListener", "pinch");
        return false;
    }

    @Override
    public void pinchStop() {
        Gdx.app.log("GestureListener", "pinchStop");
    }

}
