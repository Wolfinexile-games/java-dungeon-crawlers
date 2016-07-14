package main.java;

/**
 * Created by WaddlesMcSqueezy on 7/14/2016.
 */
public class GameLoop extends DCGameLoop {

    GameStateManager gameStateManager;

    public GameLoop(int width, int height) {
        super(width, height);
    }

    @Override
    public void render() {
        super.render();
        gameStateManager.render(graphics2D);
        clear();
    }

    @Override
    public void tick(double deltaTime) {
        gameStateManager.tick(deltaTime);
    }

    @Override
    public void init() {
        gameStateManager = new GameStateManager();
        gameStateManager.init();
        super.init();
    }

    @Override
    public void clear() {
        super.clear();
    }
}
