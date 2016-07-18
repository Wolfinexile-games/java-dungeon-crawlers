package main.java.logic;

import main.java.engine.gfx.Block;
import main.java.scenes.TileManager;

import java.awt.*;

/**
 * Created by WaddlesMcSqueezy on 7/17/2016.
 */
public class Check {

    public static boolean CollisionPlayerBlock(Point p1, Point p2) {
        for(Block block : TileManager.blocks) {
            if(Block.isSolid()) {
                if(block.contains(p1) || block.contains(p2)) {
                    return true;
                }
            }
        }
        return false;
    }
}
