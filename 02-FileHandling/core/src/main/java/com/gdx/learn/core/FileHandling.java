package com.gdx.learn.core;

import com.badlogic.gdx.graphics.GL30;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.files.FileHandle;

public class FileHandling implements ApplicationListener {

    Texture texture;
    SpriteBatch batch;
    float elapsed;

    @Override
    public void create() {

        boolean isExtAvailable = Gdx.files.isExternalStorageAvailable();
        boolean isLocAvailable = Gdx.files.isLocalStorageAvailable();
        String extRoot = Gdx.files.getExternalStoragePath();
        String locRoot = Gdx.files.getLocalStoragePath();

        Gdx.app.log("isExternalStorageAvailable", ": " + isExtAvailable);
        Gdx.app.log("isLocalStorageAvailable", ": " + isLocAvailable);
        Gdx.app.log("getExternalStoragePath", ": " + extRoot);
        Gdx.app.log("getLocalStoragePath", ": " + locRoot);

        FileHandle handle = Gdx.files.internal("data/info.txt");
        String readString1 = handle.readString();
        Gdx.app.log("read info1", ": " + readString1);
        FileHandle handle2 = Gdx.files.classpath("data/info.txt");
        String readString2 = handle2.readString();
        Gdx.app.log("read info2", ": " + readString2);

        String external = "\\Proyectos\\gdxLearn\\02-FileHandling\\assets\\";
        FileHandle handle3 = Gdx.files.external(external.concat("data/info.txt"));
        String readString3 = handle3.readString();
        Gdx.app.log("read info3", ": " + readString3);

        String absolute = "\\Proyectos\\gdxLearn\\02-FileHandling\\assets\\";
        FileHandle handle4 = Gdx.files.external(absolute.concat("data/info.txt"));
        String readString4 = handle4.readString();
        Gdx.app.log("read info4", ": " + readString4);
        handle4.writeString(", apend \n", true);

        boolean exists = Gdx.files.external(external.concat("data/info.txt")).exists();
        boolean isDirectory = Gdx.files.external(external.concat("data")).isDirectory();
        Gdx.app.log("exists", ": " + exists);
        Gdx.app.log("isDirectory", ": " + isDirectory);

        FileHandle[] files = Gdx.files.internal("data/").list();
        for (FileHandle file : files) {
            Gdx.app.log("file", ": " + file.name());
        }

        FileHandle parent = Gdx.files.internal("data\\a\\info_a.txt").parent();
        FileHandle child = Gdx.files.internal("data/a/").child("info_a.txt");
        Gdx.app.log("parent", ": " + parent);
        Gdx.app.log("child", ": " + child);

        //TODO generar movimiento de archivos interno y eliminaci?n.

        texture = new Texture(Gdx.files.internal("libgdx-logo.png"));
        batch = new SpriteBatch();
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
