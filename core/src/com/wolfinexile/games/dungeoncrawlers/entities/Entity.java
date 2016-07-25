package com.wolfinexile.games.dungeoncrawlers.entities;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;

/**
 * Created by WaddlesMcSqueezy on 7/22/2016.
 */
public abstract class Entity {

    Sprite sprite;
    Texture texture;

    private float xPos = sprite.getX();
    private float yPos = sprite.getY();

    public Entity(int x, int y) {

        texture = new Texture(Gdx.files.internal("player_idle.png"));
        sprite = new Sprite(texture);
        sprite.setX(x);
        sprite.setY(y);
    }

    public void moveUp() {
        this.sprite.translateX(15);
    }

    public void moveDown() {

    }

    public void moveLeft() {

    }

    public void moveRight() {

    }

    public void draw() {

    }
}
