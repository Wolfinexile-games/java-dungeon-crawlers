package main.java.readwrite;

import java.awt.image.BufferedImage;

/**
 * Created by WaddlesMcSqueezy on 7/14/2016.
 */
public class SpriteSheet {

    private BufferedImage spriteSheet;

    public SpriteSheet() {

    }

    public void setSpriteSheet(BufferedImage spriteSheet) {
        this.spriteSheet = spriteSheet;
    }

    public BufferedImage getTile(int xTile, int yTile, int width, int heigth) {
        BufferedImage sprite = spriteSheet.getSubimage(xTile, yTile, width, heigth);
        return sprite;
    }
}
