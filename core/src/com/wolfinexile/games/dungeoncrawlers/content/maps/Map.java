package com.wolfinexile.games.dungeoncrawlers.content.maps;

import com.badlogic.gdx.maps.MapLayer;
import com.badlogic.gdx.maps.MapObjects;
import com.badlogic.gdx.maps.tiled.TiledMap;
import com.badlogic.gdx.maps.tiled.TmxMapLoader;
import com.wolfinexile.games.dungeoncrawlers.entities.Object;

/**
 * Created by WaddlesMcSqueezy on 7/20/2016.
 */
public class Map {

    TiledMap map;
    MapLayer layer;
    MapObjects objects;

    public Map(String file) {
        map = new TmxMapLoader().load(file + ".tmx");
        layer = map.getLayers().get(0);
        objects = layer.getObjects();
    }

    public void addObject(Object object) {
        layer.getObjects().add(object.getNewObject());
    }

    public TiledMap getMap() {
        return map;
    }

    public MapLayer getLayer() {
        return layer;
    }

    public MapObjects getObjects() {
        return objects;
    }
}
