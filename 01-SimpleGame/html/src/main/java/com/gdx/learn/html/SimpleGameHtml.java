package com.gdx.learn.html;

import com.gdx.learn.core.SimpleGame;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.backends.gwt.GwtApplication;
import com.badlogic.gdx.backends.gwt.GwtApplicationConfiguration;

public class SimpleGameHtml extends GwtApplication {
	@Override
	public ApplicationListener getApplicationListener () {
		return new SimpleGame();
	}
	
	@Override
	public GwtApplicationConfiguration getConfig () {
		return new GwtApplicationConfiguration(480, 320);
	}
}
