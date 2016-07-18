package main.java.stats.softstats;

/**
 * Created by WaddlesMcSqueezy on 7/17/2016.
 */
public class SoftStats {

    private int lootChanceModifier;

    private int currentSanity;
    private int sanityRangeMin = 0;
    private int sanityRangeMax = 100;

    public int getLootChanceModifier() {
        return lootChanceModifier;
    }

    public void setLootChanceModifier(int lootChanceModifier) {
        this.lootChanceModifier = lootChanceModifier;
    }

    public int getCurrentSanity() {
        return currentSanity;
    }

    public void setCurrentSanity(int currentSanity) {
        this.currentSanity = currentSanity;
    }

    public int getSanityRangeMin() {
        return sanityRangeMin;
    }

    public void setSanityRangeMin(int sanityRangeMin) {
        this.sanityRangeMin = sanityRangeMin;
    }

    public int getSanityRangeMax() {
        return sanityRangeMax;
    }

    public void setSanityRangeMax(int sanityRangeMax) {
        this.sanityRangeMax = sanityRangeMax;
    }
}
