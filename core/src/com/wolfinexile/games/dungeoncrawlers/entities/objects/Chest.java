package com.wolfinexile.games.dungeoncrawlers.entities.objects;

import com.wolfinexile.games.dungeoncrawlers.entities.Object;

import java.util.HashMap;

/**
 * Created by WaddlesMcSqueezy on 7/26/2016.
 */
public class Chest extends Object {

    //chest inventory
    private HashMap inventory = new HashMap();

    public Chest(String name) {

        super(name, objectTypes.CHEST);
    }

    public void generateInventory() {
    }
}