package com.wolfinexile.games.dungeoncrawlers.handlers;

import com.badlogic.gdx.Input;
import com.badlogic.gdx.InputAdapter;

/**
 * Created by WaddlesMcSqueezy on 7/19/2016.
 */
public class MyInputProcessor extends InputAdapter {

    public boolean keyDown(int key) {
        if(key == Input.Keys.W) {
            MyInput.setKey(MyInput.UP, true);
        }
        if(key == Input.Keys.S) {
            MyInput.setKey(MyInput.DOWN, true);
        }
        if(key == Input.Keys.A) {
            MyInput.setKey(MyInput.LEFT, true);
        }
        if(key == Input.Keys.D) {
            MyInput.setKey(MyInput.RIGHT, true);
        }
        return true;
    }

    public boolean keyUp(int key) {
        if(key == Input.Keys.W) {
            MyInput.setKey(MyInput.UP, false);
        }
        if(key == Input.Keys.S) {
            MyInput.setKey(MyInput.DOWN, false);
        }
        if(key == Input.Keys.A) {
            MyInput.setKey(MyInput.LEFT, false);
        }
        if(key == Input.Keys.D) {
            MyInput.setKey(MyInput.RIGHT, false);
        }
        return true;
    }
}
