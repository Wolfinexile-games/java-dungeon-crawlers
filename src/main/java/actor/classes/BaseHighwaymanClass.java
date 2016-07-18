package main.java.actor.classes;

/**
 * Created by WaddlesMcSqueezy on 7/18/2016.
 */
public class BaseHighwaymanClass extends BaseCharacterClass {

    public BaseHighwaymanClass() {

        this.setCharacterClassName("Highwayman");
        this.setCharacterClassDescription("A road warrior searching for a righteous cause.");

        this.setAgility(7);
        this.setCharisma(3);
        this.setEndurance(7);
        this.setFaith(5);
        this.setKnowledge(3);
        this.setLuck(4);
        this.setPerception(7);
        this.setSanity(4);
        this.setStrength(5);
    }
}
