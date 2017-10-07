package com.gdx.learn.html;

import com.gdx.learn.core.TextInput;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.backends.gwt.GwtApplication;
import com.badlogic.gdx.backends.gwt.GwtApplicationConfiguration;

public class TextInputHtml extends GwtApplication {
	@Override
	public ApplicationListener getApplicationListener () {
		return new TextInput();
	}
	
	@Override
	public GwtApplicationConfiguration getConfig () {
		return new GwtApplicationConfiguration(480, 320);
	}
}
