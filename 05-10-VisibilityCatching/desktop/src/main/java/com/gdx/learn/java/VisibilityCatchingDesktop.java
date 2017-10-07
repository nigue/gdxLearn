package com.gdx.learn.java;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;

import com.gdx.learn.core.VisibilityCatching;

public class VisibilityCatchingDesktop {
	public static void main (String[] args) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
                config.height = 600;
                config.width = 800;
		new LwjglApplication(new VisibilityCatching(), config);
	}
}
