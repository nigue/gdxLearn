package com.gdx.learn.html;

import com.gdx.learn.core.FileHandling;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.backends.gwt.GwtApplication;
import com.badlogic.gdx.backends.gwt.GwtApplicationConfiguration;

public class FileHandlingHtml extends GwtApplication {
	@Override
	public ApplicationListener getApplicationListener () {
		return new FileHandling();
	}
	
	@Override
	public GwtApplicationConfiguration getConfig () {
		return new GwtApplicationConfiguration(480, 320);
	}
}
