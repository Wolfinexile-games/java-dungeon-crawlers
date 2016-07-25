package com.wolfinexile.games.dungeoncrawlers.content.classes;

import com.wolfinexile.games.dungeoncrawlers.logic.player.LycanTransform;
import com.wolfinexile.games.dungeoncrawlers.logic.player.LycanTransformBack;

/**
 * Created by WaddlesMcSqueezy on 7/17/2016.
 */
public class BaseLycanClass extends BaseCharacterClass {

    public BaseLycanClass()
    {
        LycanTransform lycanTransform;
        LycanTransformBack lycanTransformBack;

        this.setCharacterClassName("Lycan");
        this.setCharacterClassDescription("An abomination of nature. A bane of all that is holy. Some believe the wolf blood to be a blessing, others a curse.");

        this.setAgility(5);
        this.setCharisma(2);
        this.setEndurance(8);
        this.setFaith(1);
        this.setKnowledge(5);
        this.setLuck(4);
        this.setPerception(7);
        this.setSanity(4);
        this.setStrength(9);
    }
}
