package main.java.main;

import main.java.scenes.DungeonLevelLoader;

import java.awt.*;
import java.util.Stack;

/**
 * Created by WaddlesMcSqueezy on 7/14/2016.
 */
public class GameStateManager {

    public static Stack<GameState> states;

    public GameStateManager() {
        states = new Stack<GameState>();
        states.push(new DungeonLevelLoader(this));
    }

    public void tick(double deltaTime) {
        states.peek().tick(deltaTime);

    }

    public void render(Graphics2D g) {
        states.peek().render(g);
    }

    public void init() {
        states.peek().init();
    }
}
