package com.gdx.learn.java;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;

import com.gdx.learn.core.InputHandling;
import com.gdx.learn.core.query.impl.JavaQueryImpl;

public class InputHandlingDesktop {
	public static void main (String[] args) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		new LwjglApplication(new InputHandling(new JavaQueryImpl()), config);
	}
}
