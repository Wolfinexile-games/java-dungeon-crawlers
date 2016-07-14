/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package main.java.items;

/**
 *
 * @author WaddlesMcSqueezy
 */
public class BasePotion extends BaseItemStat {
 
    public enum PotionTypes {
        HEALTH,
        CHARISMA,
        LUCK,
        AGILITY,
        STRENGTH,
        SPEED,
        COMBO, }
    
    private PotionTypes potionType;
    private int spellEffectID;
    
    /**
     * @return the potionType
     */
    public PotionTypes getPotionType() {
        return potionType;
    }

    /**
     * @param potionType the potionType to set
     */
    public void setPotionType(PotionTypes potionType) {
        this.potionType = potionType;
    }

    /**
     * @return the spellEffectID
     */
    public int getSpellEffectID() {
        return spellEffectID;
    }

    /**
     * @param spellEffectID the spellEffectID to set
     */
    public void setSpellEffectID(int spellEffectID) {
        this.spellEffectID = spellEffectID;
    }
}
