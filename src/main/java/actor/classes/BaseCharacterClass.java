package main.java.actor.classes;

/**
 * Created by WaddlesMcSqueezy on 7/17/2016.
 */
public class BaseCharacterClass {

    private String characterClassName;
    private String characterClassDescription;

    public String getCharacterClassName() {
        return characterClassName;
    }

    public void setCharacterClassName(String characterClassName) {
        this.characterClassName = characterClassName;
    }

    public String getCharacterClassDescription() {
        return characterClassDescription;
    }

    public void setCharacterClassDescription(String characterClassDescription) {
        this.characterClassDescription = characterClassDescription;
    }

    /*
 ___ ___   ____  ____   ___   ____        _____ ______   ____  ______  _____
|   |   | /    ||    | /   \ |    \      / ___/|      | /    ||      |/ ___/
| _   _ ||  o  ||__  ||     ||  D  )    (   \_ |      ||  o  ||      (   \_
|  \_/  ||     |__|  ||  O  ||    /      \__  ||_|  |_||     ||_|  |_|\__  |
|   |   ||  _  /  |  ||     ||    \      /  \ |  |  |  |  _  |  |  |  /  \ |
|   |   ||  |  \  `  ||     ||  .  \     \    |  |  |  |  |  |  |  |  \    |
|___|___||__|__|\____| \___/ |__|\_|      \___|  |__|  |__|__|  |__|   \___|
     */

    public void    checkStatRange(int stat) {
        if(stat < 1) {
            stat = 1;
        }
        if(stat > 50) {
            stat = 50;
        }
    }

    private int Agility;
    private int Charisma;
    private int Endurance;
    private int Faith;
    private int Knowledge;
    private int Luck;
    private int Perception;
    private int Sanity;
    private int Strength;

    public int getAgility() {
        return Agility;
    }

    public void setAgility(int agility) {
        Agility = agility;
        checkStatRange(Agility);
    }

    public int getCharisma() {
        return Charisma;
    }

    public void setCharisma(int charisma) {
        Charisma = charisma;
        checkStatRange(Charisma);
    }

    public int getEndurance() {
        return Endurance;
    }

    public void setEndurance(int endurance) {
        Endurance = endurance;
        checkStatRange(Endurance);
    }

    public int getFaith() {
        return Faith;
    }

    public void setFaith(int faith) {
        Faith = faith;
        checkStatRange(Faith);
    }

    public int getKnowledge() {
        return Knowledge;
    }

    public void setKnowledge(int knowledge) {
        Knowledge = knowledge;
        checkStatRange(Knowledge);
    }

    public int getLuck() {
        return Luck;
    }

    public void setLuck(int luck) {
        Luck = luck;
        checkStatRange(Luck);
    }

    public int getPerception() {
        return Perception;
    }

    public void setPerception(int perception) {
        Perception = perception;
        checkStatRange(Perception);
    }

    public int getSanity() {
        return Sanity;
    }

    public void setSanity(int sanity) {
        Sanity = sanity;
        checkStatRange(Sanity);
    }

    public int getStrength() {
        return Strength;
    }

    public void setStrength(int strength) {
        Strength = strength;
        checkStatRange(Strength);
    }

    /*
           _                        _        _
          (_)                      | |      | |
 _ __ ___  _ _ __   ___  _ __   ___| |_ __ _| |_ ___
| '_ ` _ \| | '_ \ / _ \| '__| / __| __/ _` | __/ __|
| | | | | | | | | | (_) | |    \__ \ || (_| | |_\__ \
|_| |_| |_|_|_| |_|\___/|_|    |___/\__\__,_|\__|___/

     */

    private int Health;
    private int Melee;
    private int Shields;
    private int Explosives;
    private int Ranged;
    private int Speech;
    private int Trade;
    private int Lockpick;
    private int Traps;
    private int Medical;
    private int Survival;
    private int Speed;
    private int Crafting;
    private int Stealth;
    private int CarryWeight;

    public int getHealth() {
        return Health;
    }

    public void setHealth(int health) {
        Health = health;
        checkStatRange(Health);
    }

    public int getMelee() {
        return Melee;
    }

    public void setMelee(int melee) {
        Melee = melee;
        checkStatRange(Melee);
    }

    public int getShields() {
        return Shields;
    }

    public void setShields(int shields) {
        Shields = shields;
        checkStatRange(Shields);
    }

    public int getExplosives() {
        return Explosives;
    }

    public void setExplosives(int explosives) {
        Explosives = explosives;
        checkStatRange(Explosives);
    }

    public int getRanged() {
        return Ranged;
    }

    public void setRanged(int ranged) {
        Ranged = ranged;
        checkStatRange(Ranged);
    }

    public int getSpeech() {
        return Speech;
    }

    public void setSpeech(int speech) {
        Speech = speech;
        checkStatRange(Speech);
    }

    public int getTrade() {
        return Trade;
    }

    public void setTrade(int trade) {
        Trade = trade;
        checkStatRange(Trade);
    }

    public int getLockpick() {
        return Lockpick;
    }

    public void setLockpick(int lockpick) {
        Lockpick = lockpick;
        checkStatRange(Lockpick);
    }

    public int getTraps() {
        return Traps;
    }

    public void setTraps(int traps) {
        Traps = traps;
        checkStatRange(Traps);
    }

    public int getMedical() {
        return Medical;
    }

    public void setMedical(int medical) {
        Medical = medical;
        checkStatRange(Medical);
    }

    public int getSurvival() {
        return Survival;
    }

    public void setSurvival(int survival) {
        Survival = survival;
        checkStatRange(Survival);
    }

    public int getSpeed() {
        return Speed;
    }

    public void setSpeed(int speed) {
        Speed = speed;
        checkStatRange(Speed);
    }

    public int getCrafting() {
        return Crafting;
    }

    public void setCrafting(int crafting) {
        Crafting = crafting;
        checkStatRange(Crafting);
    }

    public int getStealth() {
        return Stealth;
    }

    public void setStealth(int stealth) {
        Stealth = stealth;
        checkStatRange(Stealth);
    }

    public int getCarryWeight() {
        return CarryWeight;
    }

    public void setCarryWeight(int carryWeight) {
        CarryWeight = carryWeight;
        checkStatRange(CarryWeight);
    }
}
