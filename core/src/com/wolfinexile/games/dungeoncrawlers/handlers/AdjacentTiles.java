package com.wolfinexile.games.dungeoncrawlers.handlers;

import com.badlogic.gdx.maps.tiled.TiledMapTileLayer;
import com.wolfinexile.games.dungeoncrawlers.entities.Entity;

/**
 * Created by WaddlesMcSqueezy on 7/23/2016.
 */
public class AdjacentTiles {

    void getAdjacentTiles(Entity entity, TiledMapTileLayer map) {
        float x = entity.getX();
        float y = entity.getY();

        if(map.getCell((int)x , (int)y).getTile().getProperties().containsKey("wall")) {

        }
    }
}
