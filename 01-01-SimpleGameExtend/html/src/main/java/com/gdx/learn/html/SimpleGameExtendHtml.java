package com.gdx.learn.html;

import com.gdx.learn.core.SimpleGameExtend;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.backends.gwt.GwtApplication;
import com.badlogic.gdx.backends.gwt.GwtApplicationConfiguration;

public class SimpleGameExtendHtml extends GwtApplication {
	@Override
	public ApplicationListener getApplicationListener () {
		return new SimpleGameExtend();
	}
	
	@Override
	public GwtApplicationConfiguration getConfig () {
		return new GwtApplicationConfiguration(480, 320);
	}
}
