package main.java.actor;

import main.java.engine.gfx.Vector2F;
import main.java.logic.Check;
import main.java.main.GameLoopDC;
import main.java.main.Main;
import main.java.scenes.DungeonLevelLoader;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * Created by WaddlesMcSqueezy on 7/17/2016.
 */
public class Player implements KeyListener {

    Vector2F pos;

    private int tileX, tileY;

    private int width = 42;
    private int height = 42;

    private static boolean up, down, left, right;
    private static boolean isMoving = false;

    private int speed = 2;

    public Player() {
        pos = new Vector2F(Main.width / 2 - width / 2, Main.height / 2 - height / 2);
    }

    public void init() {

    }

    public void tick(double deltaTime) {

        if (up) {

            if(Check.CollisionPlayerBlock(new Point((int) (pos.xpos + DungeonLevelLoader)))) {

            }

            pos.ypos-=speed;
        }

        if (down) {
            pos.ypos+=speed;
        }

        if (left) {
            pos.xpos-=speed;
        }

        if (right) {
            pos.xpos+=speed;
        }
    }

    public boolean canMove(int tileX, int tileY) {
        return true;
    }

    public void render(Graphics2D g) {
        g.fillRect((int) pos.xpos, (int) pos.ypos, width, height);
    }

    public void keyTyped(KeyEvent e) {

    }

    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();

        if(key == KeyEvent.VK_W){
            up = true;
        }

        if(key == KeyEvent.VK_S){
            down = true;

        }

        if(key == KeyEvent.VK_A){
            left = true;

        }

        if(key == KeyEvent.VK_D){
            right = true;

        }
    }

    public void keyReleased(KeyEvent e) {
        int key = e.getKeyCode();

        if(key == KeyEvent.VK_W){
            up = false;
        }

        if(key == KeyEvent.VK_S){
            down = false;

        }

        if(key == KeyEvent.VK_A){
            left = false;

        }

        if(key == KeyEvent.VK_D){
            right = false;

        }
    }
}
