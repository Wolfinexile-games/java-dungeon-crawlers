package com.wolfinexile.games.dungeoncrawlers.handlers;

import java.awt.event.KeyEvent;

/**
 * Created by WaddlesMcSqueezy on 7/22/2016.
 */
public class Event {

    public boolean playerInput() {
        boolean up, down, left, right, interact;

        if(MyInput.isDown(KeyEvent.VK_W)) {
            up = true;
            return up;
        }
        if(MyInput.isDown(KeyEvent.VK_S)) {
            down = true;
            return down;
        }
        if(MyInput.isDown(KeyEvent.VK_A)) {
           left = true;
            return left;
        }
        if(MyInput.isDown(KeyEvent.VK_D)) {
            right = true;
            return right;
        }
        if(MyInput.isDown(KeyEvent.VK_E)) {
            interact = true;
            return interact;
        }
        return false;
    }
}
