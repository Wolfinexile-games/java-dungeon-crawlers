/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package main.java.items;

/**
 *
 * @author WaddlesMcSqueezy
 */
public class BaseEquipment {
    
    public enum EquipmentTypes {
        HEAD,
        NECK,
        BACK,
        CHEST,
        HANDS,
        FINGERS,
        BELT,
        LEGS,
        FEET }

    private EquipmentTypes equipmentType;
    private int spellEffectID;
    
    /**
     * @return the equipmentType
     */
    public EquipmentTypes getEquipmentType() {
        return equipmentType;
    }

    /**
     * @param equipmentType the equipmentType to set
     */
    public void setEquipmentType(EquipmentTypes equipmentType) {
        this.equipmentType = equipmentType;
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
