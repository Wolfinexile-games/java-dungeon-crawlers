/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package main.java.items;

/**
 *
 * @author WaddlesMcSqueezy
 */
public class BaseWeapon extends BaseItemStat {

    	public enum WeaponTypes {
        SHORTSWORD,
        BROADSWORD,
        LONGSWORD,
        SHORTBOW,
        HUNTINGBOW,
        LONGBOW,
        SHOTGUN,
        LEVERACTIONRIFLE,
        REVOLVER,
        QUARTERSTAFF,
        GLAIVE,
        BUCKLER,
        LIGHTSHIELD,
        HEAVYSHIELD }

    public enum Slots {
        RIGHT,
        LEFT,
        BOTH }

    public enum CombatTypes {
        MELEE,
        RANGED,
        SPELL }

    private WeaponTypes weaponType;
    private int spellEffectID;
    private int slot;
    private int combatType;
    private int healthDamage;
    private int bleedChance;
    private int blightChance;
    private int bleedDamage;
    private int blightDamage;

    /**
     * @return the weaponType
     */
    public WeaponTypes getWeaponType() {
        return weaponType;
    }

    /**
     * @param weaponType the weaponType to set
     */
    public void setWeaponType(WeaponTypes weaponType) {
        this.weaponType = weaponType;
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

    /**
     * @return the slot
     */
    public int getSlot() {
        return slot;
    }

    /**
     * @param slot the slot to set
     */
    public void setSlot(int slot) {
        this.slot = slot;
    }

    /**
     * @return the combatType
     */
    public int getCombatType() {
        return combatType;
    }

    /**
     * @param combatType the combatType to set
     */
    public void setCombatType(int combatType) {
        this.combatType = combatType;
    }

    /**
     * @return the healthDamage
     */
    public int getHealthDamage() {
        return healthDamage;
    }

    /**
     * @param healthDamage the healthDamage to set
     */
    public void setHealthDamage(int healthDamage) {
        this.healthDamage = healthDamage;
    }

    /**
     * @return the bleedChance
     */
    public int getBleedChance() {
        return bleedChance;
    }

    /**
     * @param bleedChance the bleedChance to set
     */
    public void setBleedChance(int bleedChance) {
        this.bleedChance = bleedChance;
    }

    /**
     * @return the blightChance
     */
    public int getBlightChance() {
        return blightChance;
    }

    /**
     * @param blightChance the blightChance to set
     */
    public void setBlightChance(int blightChance) {
        this.blightChance = blightChance;
    }

    /**
     * @return the bleedDamage
     */
    public int getBleedDamage() {
        return bleedDamage;
    }

    /**
     * @param bleedDamage the bleedDamage to set
     */
    public void setBleedDamage(int bleedDamage) {
        this.bleedDamage = bleedDamage;
    }

    /**
     * @return the blightDamage
     */
    public int getBlightDamage() {
        return blightDamage;
    }

    /**
     * @param blightDamage the blightDamage to set
     */
    public void setBlightDamage(int blightDamage) {
        this.blightDamage = blightDamage;
    }
}
