package main.java.main;

import java.awt.*;

/**
 * Created by WaddlesMcSqueezy on 7/14/2016.
 */
public abstract class GameState {

    GameStateManager gsm;

    public GameState(GameStateManager gsm) {
        this.gsm = gsm;
    }

    public abstract void tick(double deltaTime);
    public abstract void render(Graphics2D g);
    public abstract void init();
}
