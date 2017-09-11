package com.gdx.learn.java;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;

import com.gdx.learn.core.PollingHandling;
import com.gdx.learn.core.query.impl.JavaQueryImpl;

public class PollingHandlingDesktop {

    public static void main(String[] args) {
        LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
        new LwjglApplication(new PollingHandling(new JavaQueryImpl()), config);
    }
}
