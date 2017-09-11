package com.gdx.learn.core.query.impl;

import com.badlogic.gdx.Gdx;
import com.gdx.learn.core.query.QueryService;

public class AndroidQueryImpl implements QueryService {

    @Override
    public String loging() {
        String result = "";
        for (int i = 0; i <= 3; i++) {
            if (Gdx.input.isTouched(i)) {
                int fX = Gdx.input.getX(1);
                int fY = Gdx.input.getY(1);
                result = result + " | Fr" + i + ": " + fX + ", " + fY;
            }
        }
        return result;
    }

}
