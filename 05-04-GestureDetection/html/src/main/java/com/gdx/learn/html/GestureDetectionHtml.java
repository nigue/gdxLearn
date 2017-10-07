package com.gdx.learn.html;

import com.gdx.learn.core.GestureDetection;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.backends.gwt.GwtApplication;
import com.badlogic.gdx.backends.gwt.GwtApplicationConfiguration;

public class GestureDetectionHtml extends GwtApplication {
	@Override
	public ApplicationListener getApplicationListener () {
		return new GestureDetection();
	}
	
	@Override
	public GwtApplicationConfiguration getConfig () {
		return new GwtApplicationConfiguration(480, 320);
	}
}
