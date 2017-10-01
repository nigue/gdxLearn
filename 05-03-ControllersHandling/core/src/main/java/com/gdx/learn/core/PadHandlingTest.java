package com.gdx.learn.core;

import com.badlogic.gdx.graphics.GL30;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.controllers.Controller;
import com.badlogic.gdx.controllers.Controllers;
import com.gdx.learn.core.yoistic.Axis8Button;
import com.gdx.learn.core.yoistic.ControllerGenius;

public class PadHandlingTest implements ApplicationListener {

    Texture texture;
    SpriteBatch batch;
    float elapsed;
    private Controller c;

    @Override
    public void create() {
        texture = new Texture(Gdx.files.internal("libgdx-logo.png"));
        batch = new SpriteBatch();

        for (Controller newController : Controllers.getControllers()) {
            Gdx.app.log("Controller", newController.getName());
            c = newController;
        }
        
        Controllers.addListener(new ControllerGenius());
    }

    @Override
    public void resize(int width, int height) {
    }

    @Override
    public void render() {
        elapsed += Gdx.graphics.getDeltaTime();
        Gdx.gl.glClearColor(0, 0, 0, 0);
        Gdx.gl.glClear(GL30.GL_COLOR_BUFFER_BIT);

        if (false) {
            buttonCheck();
            horizontalAxis();
            verticalAxis();
        }
        
        batch.begin();
        batch.draw(texture, 100 + 100 * (float) Math.cos(elapsed), 100 + 25 * (float) Math.sin(elapsed));
        batch.end();
    }

    private void horizontalAxis() {
        float axisValue = c.getAxis(Axis8Button.HORIZONTAL_AXIS);
        if (axisValue == 1F) {
            Gdx.app.log("axisValue", "RIGHT");
        }
        if (axisValue == -1F) {
            Gdx.app.log("axisValue", "LEFT");
        }
    }

    private void verticalAxis() {
        float axisValue = c.getAxis(Axis8Button.VERTICAL_AXIS);
        if (axisValue == 1F) {
            Gdx.app.log("axisValue", "DOWN");
        }
        if (axisValue == -1F) {
            Gdx.app.log("axisValue", "UP");
        }
    }

    private void buttonCheck() {
        String data = c.getButton(Axis8Button.SQUARE) ? "SQUARE" : "";
        data = c.getButton(Axis8Button.DOWN) ? "DOWN" : data;
        data = c.getButton(Axis8Button.CIRCLE) ? "CIRCLE" : data;
        data = c.getButton(Axis8Button.L1) ? "L1" : data;
        data = c.getButton(Axis8Button.L2) ? "L2" : data;
        data = c.getButton(Axis8Button.R1) ? "R1" : data;
        data = c.getButton(Axis8Button.R2) ? "R2" : data;
        data = c.getButton(Axis8Button.LEFT) ? "LEFT" : data;
        data = c.getButton(Axis8Button.RIGHT) ? "RIGHT" : data;
        data = c.getButton(Axis8Button.TRIANGLE) ? "TRIANGLE" : data;
        data = c.getButton(Axis8Button.UP) ? "UP" : data;
        data = c.getButton(Axis8Button.X) ? "X" : data;

        if (!data.isEmpty()) {
            Gdx.app.log("apretado", data);
        }
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
