package main.java.main;

import main.java.actor.Player;
import main.java.engine.gfx.Board;

import java.awt.*;

/**
 * Created by WaddlesMcSqueezy on 7/13/2016.
 */
public class Main {

    public static GraphicsDevice graphicsDevice = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();
    public static int width = graphicsDevice.getDisplayMode().getWidth();
    public static int height = graphicsDevice.getDisplayMode().getHeight();

    public static void main(String[] args) {

        Board frame = new Board("Dungeon Crawlers!", width, height);
        frame.setFullScreen(0);
        frame.addKeyListener(new Player());
        frame.add(new GameLoopDC(width, height));
        frame.setVisible(true);
    }
}
