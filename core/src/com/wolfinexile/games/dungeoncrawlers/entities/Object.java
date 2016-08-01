package com.wolfinexile.games.dungeoncrawlers.entities;

import com.badlogic.gdx.maps.objects.TextureMapObject;

/**
 * Created by WaddlesMcSqueezy on 7/26/2016.
 */
public class Object {

    TextureMapObject newObject;

    public enum objectTypes {

        CHEST,
        INTRIGUE,
        OBSTACLE
    }

    private String name;
    private objectTypes objectType;

    public Object(String name, objectTypes objectType) {

        TextureMapObject newObject = new TextureMapObject();
        newObject.setName(name);
        this.objectType = objectType;
    }

    public TextureMapObject getNewObject() {
        return newObject;
    }
}
