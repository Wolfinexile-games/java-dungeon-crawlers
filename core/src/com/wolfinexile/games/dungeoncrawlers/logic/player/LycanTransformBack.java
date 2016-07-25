package com.wolfinexile.games.dungeoncrawlers.logic.player;

import com.wolfinexile.games.dungeoncrawlers.content.BaseActor;

/**
 * Created by WaddlesMcSqueezy on 7/19/2016.
 */
public class LycanTransformBack implements Ability {

    private int turnsRemaining = 0;

    @Override
    public void cast() {
        if(isOnCooldown()){ System.out.println("this ability is on cooldown!"); }
        if(!isOnCooldown()) { effect(); cooldown();}
    }

    @Override
    public void effect() {

    }

    public void effect(BaseActor actorclass) {
        actorclass.getActorClass().setAgility(actorclass.getActorClass().getAgility() - 2);
        actorclass.getActorClass().setCharisma(actorclass.getActorClass().getCharisma() + 10);
        actorclass.getActorClass().setEndurance(actorclass.getActorClass().getEndurance() - 2);
        actorclass.getActorClass().setKnowledge(actorclass.getActorClass().getKnowledge() + 3);
        actorclass.getActorClass().setPerception(actorclass.getActorClass().getPerception() - 1);
        actorclass.getActorClass().setStrength(actorclass.getActorClass().getStrength() - 1);
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
