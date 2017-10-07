package com.gdx.learn.html;

import com.gdx.learn.core.VisibilityCatching;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.backends.gwt.GwtApplication;
import com.badlogic.gdx.backends.gwt.GwtApplicationConfiguration;

public class VisibilityCatchingHtml extends GwtApplication {
	@Override
	public ApplicationListener getApplicationListener () {
		return new VisibilityCatching();
	}
	
	@Override
	public GwtApplicationConfiguration getConfig () {
		return new GwtApplicationConfiguration(480, 320);
	}
}
