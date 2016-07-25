package com.wolfinexile.games.dungeoncrawlers.logic.turns;

/**
 * Created by WaddlesMcSqueezy on 7/19/2016.
 */
public interface Turn {

    void turn();

    int useMove();

    void walk();

    void useAbility();

    void useItem();

    void interact();

}
