package com.gdx.learn.core;

import com.badlogic.gdx.graphics.GL30;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.InputMultiplexer;
import com.gdx.learn.core.input.MyInputAdapter;
import com.gdx.learn.core.input.MyInputProcessor;

public class EventHandling implements ApplicationListener {

    Texture texture;
    SpriteBatch batch;
    float elapsed;

    @Override
    public void create() {
        Gdx.app.log("MyTag", "my informative message");
        texture = new Texture(Gdx.files.internal("libgdx-logo.png"));
        batch = new SpriteBatch();

        InputMultiplexer multiplexer = new InputMultiplexer();
        multiplexer.addProcessor(new MyInputAdapter());
        multiplexer.addProcessor(new MyInputProcessor());
        Gdx.input.setInputProcessor(multiplexer);
    }

    @Override
    public void resize(int width, int height) {
    }

    @Override
    public void render() {
        elapsed += Gdx.graphics.getDeltaTime();
        Gdx.gl.glClearColor(0, 0, 0, 0);
        Gdx.gl.glClear(GL30.GL_COLOR_BUFFER_BIT);
        batch.begin();
        batch.draw(texture, 100 + 100 * (float) Math.cos(elapsed), 100 + 25 * (float) Math.sin(elapsed));
        batch.end();
    }

    @Override
    public void pause() {
    }

    @Override
    public void resume() {
    }

    @Override
    public void dispose() {
    }
}
