package com.wolfinexile.games.dungeoncrawlers.logic.generation;

import java.util.HashMap;
import java.util.UUID;

/**
 * Created by WaddlesMcSqueezy on 7/27/2016.
 */
public class Prefixer {

    UUID uuid = UUID.fromString("66e39e41-6973-45ec-b950-b3e643fb5556");

    HashMap prefixList = new HashMap<UUID,String>();

    public void addPrefixToSet(UUID uuid, String string) {
        prefixList.put(uuid, string);
    }

    public HashMap getPrefixMap() {

        return prefixList;
    }

    public Object getPrefix(UUID uuid) {
        return prefixList.get(uuid);

    }

}
