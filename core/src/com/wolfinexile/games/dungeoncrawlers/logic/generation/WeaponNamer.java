package com.wolfinexile.games.dungeoncrawlers.logic.generation;

import java.util.HashMap;
import java.util.UUID;

/**
 * Created by WaddlesMcSqueezy on 7/27/2016.
 */
public class WeaponNamer {

    UUID uuid = UUID.fromString("069c1249-24ff-43c4-ae17-b611eae767f6");

    HashMap weaponMap = new HashMap<UUID,String>();

    public void addWeaponToMap(UUID uuid, String string) {

        weaponMap.put(uuid, string);
    }

    public HashMap getWeaponMap() {

        return weaponMap;
    }

    public Object getWeapon(UUID uuid) {

        return weaponMap.get(uuid);
    }
    
    public String createWeaponName(Object prefix, Object weaponname) {

        String name = prefix.toString() + weaponname.toString();

        return name;
    }
}
