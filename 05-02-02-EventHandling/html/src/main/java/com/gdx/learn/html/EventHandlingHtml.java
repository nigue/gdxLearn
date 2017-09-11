package com.gdx.learn.html;

import com.gdx.learn.core.EventHandling;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.backends.gwt.GwtApplication;
import com.badlogic.gdx.backends.gwt.GwtApplicationConfiguration;

public class EventHandlingHtml extends GwtApplication {
	@Override
	public ApplicationListener getApplicationListener () {
		return new EventHandling();
	}
	
	@Override
	public GwtApplicationConfiguration getConfig () {
		return new GwtApplicationConfiguration(480, 320);
	}
}
