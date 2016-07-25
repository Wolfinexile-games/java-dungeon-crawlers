package com.wolfinexile.games.dungeoncrawlers.content;

import com.wolfinexile.games.dungeoncrawlers.content.classes.BaseCharacterClass;

/**
 * Created by WaddlesMcSqueezy on 7/17/2016.
 */
public class BaseActor {

    private String actorName;
    private int actorLevel;
    private BaseCharacterClass actorClass;
    private int actorXP;

    public void levelUp() {
        //LEVEL UP 3 MAJOR SKILLS (CAN DO ANY COMBO OF SKILLS) - CHARISMA/STRENGTH ETC...

        //PICK A PERK

        //SET NEXT LEVEL EXP REQUIREMENTS

    }

    public String getActorName() {
        return actorName;
    }

    public void setActorName(String actorName) {
        this.actorName = actorName;
    }

    public int getActorLevel() {
        return actorLevel;
    }

    public void setActorClass(BaseCharacterClass actorClass) {
        this.actorClass = actorClass;
    }

    public BaseCharacterClass getActorClass() {
        return actorClass;
    }

    public int getActorXP() {
        return actorXP;
    }

    public void setActorXP(int actorXP) {
        this.actorXP = actorXP;
    }
}
