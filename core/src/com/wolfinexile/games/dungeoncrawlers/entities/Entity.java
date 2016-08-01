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

    float xPos;
    float yPos;

    public Entity(int x, int y, String textureFilePath) {

        texture = new Texture(Gdx.files.internal(textureFilePath));
        sprite = new Sprite(texture);
        xPos = sprite.getX();
        yPos = sprite.getY();
        sprite.setX(x);
        sprite.setY(y);
    }

    public void moveUp() { this.sprite.translateX(15); }

    public void moveDown() { this.sprite.translateX(15); }

    public void moveLeft() { this.sprite.translateX(15); }

    public void moveRight() { this.sprite.translateX(15); }

    public void draw() {

    }

    public float getxPos() {
        return xPos;
    }

    public float getyPos() {
        return yPos;
    }

    public Sprite getSprite() {
        return sprite;
    }

    public Texture getTexture() {
        return texture;
    }
}
