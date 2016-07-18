package main.java.main;

import main.java.engine.gamelogic.GameLoop;
import main.java.engine.gfx.Vector2F;
import main.java.assets.AssetsLoader;

/**
 * Created by WaddlesMcSqueezy on 7/14/2016.
 */
public class GameLoopDC extends GameLoop {

    GameStateManager gameStateManager;

    public static AssetsLoader assets = new AssetsLoader();

    public GameLoopDC(int width, int height) {
        super(width, height);
    }

    public static float xOffset;
    public static float yOffset;

    @Override
    public void render() {
        super.render();
        gameStateManager.render(graphics2D);
        clear();
    }

    @Override
    public void tick(double deltaTime) {
        Vector2F.setWorldPos(xOffset, yOffset);
        gameStateManager.tick(deltaTime);
    }

    @Override
    public void init() {
        assets.init();
        Vector2F.setWorldPos(xOffset, yOffset);
        gameStateManager = new GameStateManager();
        gameStateManager.init();
        super.init();
    }

    @Override
    public void clear() {
        super.clear();
    }
}
