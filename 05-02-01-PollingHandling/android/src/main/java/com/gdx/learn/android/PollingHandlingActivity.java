package com.gdx.learn.android;

import com.gdx.learn.core.PollingHandling;

import android.os.Bundle;

import com.badlogic.gdx.backends.android.AndroidApplication;
import com.badlogic.gdx.backends.android.AndroidApplicationConfiguration;
import com.gdx.learn.core.query.impl.AndroidQueryImpl;

public class PollingHandlingActivity extends AndroidApplication {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AndroidApplicationConfiguration config = new AndroidApplicationConfiguration();
        initialize(new PollingHandling(new AndroidQueryImpl()), config);
    }
}
