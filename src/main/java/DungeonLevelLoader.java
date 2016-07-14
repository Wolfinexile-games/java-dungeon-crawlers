package main.java;

import main.java.readwrite.SpriteSheet;
import main.java.readwrite.loadImage;

import java.awt.*;

/**
 * Created by WaddlesMcSqueezy on 7/14/2016.
 */
public class DungeonLevelLoader extends GameState {

    SpriteSheet test = new SpriteSheet();

    public DungeonLevelLoader(GameStateManager gsm) {
        super(gsm);
    }

    public void tick(double deltaTime) {

    }

    public void render(Graphics2D g) {
        g.drawString("HelloWorld", 200, 200);
        g.drawImage(test.getTile(0,0,16,16),0,0,64,64,null);
    }

    public void init() {
        test.setSpriteSheet(loadImage.LoadImage(Main.class, "/assets/spritesheet.png"));
    }
}
