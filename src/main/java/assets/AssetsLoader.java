package main.java.assets;

import main.java.engine.gfx.SpriteSheet;
import main.java.engine.gfx.loadImage;
import main.java.main.Main;

import java.awt.image.BufferedImage;

/**
 * Created by WaddlesMcSqueezy on 7/14/2016.
 */
public class AssetsLoader {

    SpriteSheet blocks = new SpriteSheet();

    public static BufferedImage rock_1;
    public static BufferedImage wood_1;

    public void init() {
        blocks.setSpriteSheet(loadImage.LoadImage(Main.class, "/main/resources/spritesheet.png"));
        rock_1 = blocks.getTile(0,0,16,16);
        wood_1 = blocks.getTile(16,0,16,16);
    }

    public static BufferedImage getRock_1() {
        return rock_1;
    }

    public static BufferedImage getWood_1() {
        return wood_1;
    }
}
