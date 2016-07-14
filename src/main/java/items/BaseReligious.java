/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package main.java.items;

/**
 *
 * @author WaddlesMcSqueezy
 */
public class BaseReligious extends BaseItemStat {
    
    public enum ReligiousTypes {
        HOLY,
        SATANIC,
        OCCULT,
        VOODOO }

    public enum ReligiousItemTypes {
        IDOL,
        VESSEL,
        CHALICE,
        DOLL,
        AMULET }

    private ReligiousTypes religiousType;
    private ReligiousItemTypes religiousItemType;
    private int spellEffectID;
    
    /**
     * @return the religiousType
     */
    public ReligiousTypes getReligiousType() {
        return religiousType;
    }

    /**
     * @param religiousType the religiousType to set
     */
    public void setReligiousType(ReligiousTypes religiousType) {
        this.religiousType = religiousType;
    }

    /**
     * @return the religiousItemType
     */
    public ReligiousItemTypes getReligiousItemType() {
        return religiousItemType;
    }

    /**
     * @param religiousItemType the religiousItemType to set
     */
    public void setReligiousItemType(ReligiousItemTypes religiousItemType) {
        this.religiousItemType = religiousItemType;
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
