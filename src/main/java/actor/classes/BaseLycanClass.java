package main.java.actor.classes;

/**
 * Created by WaddlesMcSqueezy on 7/17/2016.
 */
public class BaseLycanClass extends BaseCharacterClass {

    public BaseLycanClass()
    {
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

    public void transformToLycan() {
        this.setAgility(this.getAgility() + 2);
        this.setCharisma(this.getCharisma() - 10);
        this.setEndurance(this.getEndurance() + 2);
        this.setKnowledge(this.getKnowledge() - 3);
        this.setPerception(this.getPerception() + 1);
        this.setStrength(this.getStrength() + 1);
    }

    public void transformFromLycan() {
        this.setAgility(this.getAgility() - 2);
        this.setCharisma(this.getCharisma() + 10);
        this.setEndurance(this.getEndurance() - 2);
        this.setKnowledge(this.getKnowledge() + 3);
        this.setPerception(this.getPerception() - 1);
        this.setStrength(this.getStrength() - 1);
    }
}
