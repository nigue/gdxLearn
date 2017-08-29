package com.gdx.learn.android;

import com.gdx.learn.core.InputHandling;

import android.os.Bundle;

import com.badlogic.gdx.backends.android.AndroidApplication;
import com.badlogic.gdx.backends.android.AndroidApplicationConfiguration;
import com.gdx.learn.core.query.impl.AndroidQueryImpl;

public class InputHandlingActivity extends AndroidApplication {

	@Override
	public void onCreate(Bundle savedInstanceState) {
			super.onCreate(savedInstanceState);
			AndroidApplicationConfiguration config = new AndroidApplicationConfiguration();
			initialize(new InputHandling(new AndroidQueryImpl()), config);
	}
}
