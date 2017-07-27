package com.gdx.learn.java;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;

import com.gdx.learn.core.SimpleGameExtend;

public class SimpleGameExtendDesktop {
	public static void main (String[] args) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		new LwjglApplication(new SimpleGameExtend(), config);
	}
}
