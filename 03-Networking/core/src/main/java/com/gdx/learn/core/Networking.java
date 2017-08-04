package com.gdx.learn.core;

import com.badlogic.gdx.graphics.GL30;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Net.Protocol;
import com.badlogic.gdx.net.ServerSocket;
import com.badlogic.gdx.net.ServerSocketHints;
import com.badlogic.gdx.net.Socket;
import com.badlogic.gdx.net.SocketHints;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Networking implements ApplicationListener {

    Texture texture;
    SpriteBatch batch;
    float elapsed;

    @Override
    public void create() {
        // setup a server thread where we wait for incoming connections
        // to the server
        new Thread(new Runnable() {
            @Override
            public void run() {
                ServerSocketHints hints = new ServerSocketHints();
                ServerSocket server = Gdx.net.newServerSocket(Protocol.TCP, 9999, hints);
                // wait for the next client connection
                Socket client = server.accept(null);
                // read message and send it back
                try {
                    String message = new BufferedReader(new InputStreamReader(client.getInputStream())).readLine();
                    Gdx.app.log("PingPongSocketExample", "got client message: " + message);
                    client.getOutputStream().write("PONG\n".getBytes());
                } catch (IOException e) {
                    Gdx.app.log("PingPongSocketExample", "an error occured", e);
                }
            }
        }).start();

        // create the client send a message, then wait for the 
        // server to reply
        SocketHints hints = new SocketHints();
        Socket client = Gdx.net.newClientSocket(Protocol.TCP, "localhost", 9999, hints);
        try {
            client.getOutputStream().write("PING\n".getBytes());
            String response = new BufferedReader(new InputStreamReader(client.getInputStream())).readLine();
            Gdx.app.log("PingPongSocketExample", "got server message: " + response);
        } catch (IOException e) {
            Gdx.app.log("PingPongSocketExample", "an error occured", e);
        }

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
