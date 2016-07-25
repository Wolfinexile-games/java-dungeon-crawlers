package com.wolfinexile.games.dungeoncrawlers.logic.player;

/**
 * Created by WaddlesMcSqueezy on 7/19/2016.
 */
public interface Ability {

    void cast();

    void effect();

    int cooldown();

    boolean isOnCooldown();

    int countRemainingTurns();
}
