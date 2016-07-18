package main.java.scenes;

import main.java.actor.Player;
import main.java.engine.gfx.Block;
import main.java.engine.gfx.Vector2F;
import main.java.engine.gfx.loadImage;
import main.java.main.Main;

import java.awt.*;
import java.awt.image.BufferedImage;

/**
 * Created by WaddlesMcSqueezy on 7/14/2016.
 */
public class Map {

    TileManager tiles = new TileManager();
    Player player = new Player();

    public Map() {

    }

    public void init() {
        player.init();

        BufferedImage map = null;

        try {
            map = loadImage.LoadImage(Main.class, "/main/resources/map1.png");
        } catch (Exception e) {}

        for(int x = 0; x < 64; x++) {

            for(int y = 0; y < 64; y++) {

                int col = map.getRGB(x, y);

                switch(col & 0xFFFFFF) {
                    case 0x808080:
                        tiles.blocks.add(new Block(new Vector2F(x*48,y*48), Block.BlockTypes.ROCK_1));
                        break;
                    case 0x404040:
                        tiles.blocks.add(new Block(new Vector2F(x*48,y*48), Block.BlockTypes.WOOD_1).isSolid(true));
                        break;
                    default:
                        break;
                }

            }
        }
    }

    public void tick(double deltaTime) {
        tiles.tick(deltaTime);
        player.tick(deltaTime);
    }

    public void render(Graphics2D g) {
        tiles.render(g);
        player.render(g);
    }
}
