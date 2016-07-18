package main.java.engine.gfx;

import main.java.assets.AssetsLoader;

import java.awt.*;
import java.awt.image.BufferedImage;

/**
 * Created by WaddlesMcSqueezy on 7/14/2016.
 */
public class Block extends Rectangle {

    Vector2F pos = new Vector2F();
    private int BlockSize = 48;
    private BlockTypes blockType;
    private BufferedImage block;
    private boolean isSolid;

    public Block(Vector2F pos, BlockTypes blockType) {
        this.pos = pos;
        this.blockType = blockType;
        init();
    }

    public Block isSolid(boolean isSolid) {
        this.isSolid = isSolid;
        return this;
    }

    public void init() {
        switch(blockType) {
            case ROCK_1:
                block = AssetsLoader.getRock_1();
                break;
            case WOOD_1:
                block = AssetsLoader.getWood_1();
                break;
            default:
                break;
        }
    }

    public void render(Graphics2D g) {
        g.drawRect((int)pos.getWorldLocation().xpos, (int)pos.getWorldLocation().ypos, BlockSize, BlockSize);
        g.drawImage(block, (int)pos.getWorldLocation().xpos, (int)pos.getWorldLocation().ypos, BlockSize, BlockSize, null);
    }

    public void tick(double deltaTime) {

    }

    public static boolean isSolid() {
        return false;
    }

    public enum BlockTypes {
        ROCK_1,
        WOOD_1
    }
}
