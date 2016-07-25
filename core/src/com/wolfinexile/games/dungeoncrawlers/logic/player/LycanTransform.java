package com.wolfinexile.games.dungeoncrawlers.logic.player;

import com.wolfinexile.games.dungeoncrawlers.content.classes.BaseCharacterClass;

/**
 * Created by WaddlesMcSqueezy on 7/19/2016.
 */
public class LycanTransform implements Ability {

    private int turnsRemaining = 0;

    @Override
    public void cast() {
        if(isOnCooldown()){ System.out.println("this ability is on cooldown!"); }
        if(!isOnCooldown()) { effect(); cooldown();}
    }

    @Override
    public void effect() {

    }

    public void effect(BaseCharacterClass actorclass) {
        actorclass.setAgility(actorclass.getAgility() + 2);
        actorclass.setCharisma(actorclass.getCharisma() - 10);
        actorclass.setEndurance(actorclass.getEndurance() + 2);
        actorclass.setKnowledge(actorclass.getKnowledge() - 3);
        actorclass.setPerception(actorclass.getPerception() + 1);
        actorclass.setStrength(actorclass.getStrength() + 1);
    }

    @Override
    public int cooldown() {
        turnsRemaining += 4;
        return turnsRemaining;
    }

    @Override
    public boolean isOnCooldown() {
        if(turnsRemaining <= 0) { return false; }
        return true;
    }

    @Override
    public int countRemainingTurns() {
        if(this.isOnCooldown()) { turnsRemaining -= 1; }
        return turnsRemaining;
    }
}
