package main.java.scenes;

import main.java.main.GameState;
import main.java.main.GameStateManager;

import java.awt.*;

/**
 * Created by WaddlesMcSqueezy on 7/14/2016.
 */
public class DungeonLevelLoader extends GameState {

    Map map;

    public DungeonLevelLoader(GameStateManager gsm) {
        super(gsm);
    }

    public void tick(double deltaTime) {
        map.tick(deltaTime);
    }

    public void render(Graphics2D g) {
        map.render(g);
    }

    public void init() {
        map = new Map();
        map.init();
    }
}
