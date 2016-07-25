package com.wolfinexile.games.dungeoncrawlers.states;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.physics.box2d.World;
import com.wolfinexile.games.dungeoncrawlers.entities.Player;

/**
 * Created by WaddlesMcSqueezy on 7/18/2016.
 */
public class Play implements Screen {

    private SpriteBatch batch;
    World world;

    @Override
    public void show() {
        batch = new SpriteBatch();
        Player player = new Player(world);
    }

    @Override
    public void render(float delta) {
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

    }

    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {

    }
}
