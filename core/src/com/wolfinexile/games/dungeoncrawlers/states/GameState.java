package com.wolfinexile.games.dungeoncrawlers.states;

import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.wolfinexile.games.dungeoncrawlers.handlers.GameStateManager;

/**
 * Created by WaddlesMcSqueezy on 7/18/2016.
 */
public abstract class GameState {

    protected GameStateManager gameStateManager;
    protected com.wolfinexile.games.dungeoncrawlers.Game game;

    protected SpriteBatch spriteBatch;
    protected OrthographicCamera camera;
    protected OrthographicCamera hud;

    protected GameState(GameStateManager gameStateManager) {
        this.gameStateManager = gameStateManager;
        game = gameStateManager.game();
        spriteBatch = game.getSpriteBatch();
        camera = game.getCamera();
        hud = game.getHud();
    }

    public abstract void handleInput();
    public abstract void update(float dt);
    public abstract void render();
    public abstract void dispose();

}
