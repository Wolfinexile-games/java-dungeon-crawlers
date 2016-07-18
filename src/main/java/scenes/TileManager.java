
package main.java.scenes;

import main.java.engine.gfx.Block;

import java.awt.*;
import java.util.ArrayList;

/**
 * Created by WaddlesMcSqueezy on 7/14/2016.
 */
public class TileManager {

    public static ArrayList<Block> blocks = new ArrayList<Block>();

    public TileManager() {
    }

    public void tick(double deltaTime) {
        for(Block block : blocks) {
            block.tick(deltaTime);
        }

    }

    public void render(Graphics2D g) {
        for(Block block : blocks) {
            block.render(g);
        }
    }
}
