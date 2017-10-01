package com.gdx.learn.core.yoistic;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.controllers.Controller;
import com.badlogic.gdx.controllers.ControllerListener;
import com.badlogic.gdx.controllers.Controllers;
import com.badlogic.gdx.controllers.PovDirection;
import com.badlogic.gdx.math.Vector3;

public class ControllerGenius implements ControllerListener {

    public int indexOf(Controller controller) {
        return Controllers.getControllers().indexOf(controller, true);
    }

    @Override
    public void connected(Controller cntrlr) {
    }

    @Override
    public void disconnected(Controller cntrlr) {
    }

    @Override
    public boolean buttonDown(Controller cntrlr, int i) {
        buttonCheck(cntrlr, i);
        return false;
    }

    @Override
    public boolean buttonUp(Controller cntrlr, int i) {
        return false;
    }

    @Override
    public boolean axisMoved(Controller cntrlr, int i, float f) {

        switch (i) {
            case Axis8Button.VERTICAL_AXIS:
                verticalAxis(cntrlr, f);
                break;
            case Axis8Button.HORIZONTAL_AXIS:
                horizontalAxis(cntrlr, f);
                break;
        }

        return false;
    }

    @Override
    public boolean povMoved(Controller cntrlr, int i, PovDirection pd) {
        return false;
    }

    @Override
    public boolean xSliderMoved(Controller cntrlr, int i, boolean bln) {
        return false;
    }

    @Override
    public boolean ySliderMoved(Controller cntrlr, int i, boolean bln) {
        return false;
    }

    @Override
    public boolean accelerometerMoved(Controller cntrlr, int i, Vector3 vctr) {
        return false;
    }

    private void horizontalAxis(Controller c, float axisValue) {
        if (axisValue == 1F) {
            Gdx.app.log("axisValue", "RIGHT");
        }
        if (axisValue == -1F) {
            Gdx.app.log("axisValue", "LEFT");
        }
    }

    private void verticalAxis(Controller c, float axisValue) {
        if (axisValue == 1F) {
            Gdx.app.log("axisValue", "DOWN");
        }
        if (axisValue == -1F) {
            Gdx.app.log("axisValue", "UP");
        }
    }

    private void buttonCheck(Controller c, int value) {
        String data = "";
        switch (value) {
            case Axis8Button.X:
                data = "X";
                break;
            case Axis8Button.CIRCLE:
                data = "CIRCLE";
                break;
            case Axis8Button.SQUARE:
                data = "SQUARE";
                break;
            case Axis8Button.TRIANGLE:
                data = "TRIANGLE";
                break;
            case Axis8Button.L1:
                data = "L1";
                break;
            case Axis8Button.R1:
                data = "R1";
                break;
            case Axis8Button.L2:
                data = "L2";
                break;
            case Axis8Button.R2:
                data = "R2";
                break;
            case Axis8Button.UP:
                data = "UP";
                break;
            case Axis8Button.DOWN:
                data = "DOWN";
                break;
            case Axis8Button.LEFT:
                data = "LEFT";
                break;
            case Axis8Button.RIGHT:
                data = "RIGHT";
                break;
        }

        if (!data.isEmpty()) {
            Gdx.app.log("apretado", data);
        }
    }

}
