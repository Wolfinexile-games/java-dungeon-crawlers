/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package main.java.items;

import java.util.UUID;

/**
 *
 * @author WaddlesMcSqueezy
 */
public class BaseItem {
    private String itemName;
    private String itemDescription;
    private UUID baseID;
    private ItemTypes itemType;
    private RarityTypes itemRarity;

    /**
     * @return the itemName
     */
    public String getItemName() {
        return itemName;
    }

    /**
     * @param itemName the itemName to set
     */
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    /**
     * @return the itemDescription
     */
    public String getItemDescription() {
        return itemDescription;
    }

    /**
     * @param itemDescription the itemDescription to set
     */
    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    /**
     * @return the baseID
     */
    public UUID getBaseID() {
        return baseID;
    }

    /**
     * @param baseID the baseID to set
     */
    public void setBaseID(UUID baseID) {
        this.baseID = baseID;
    }

    /**
     * @return the itemType
     */
    public ItemTypes getItemType() {
        return itemType;
    }

    /**
     * @param itemType the itemType to set
     */
    public void setItemType(ItemTypes itemType) {
        this.itemType = itemType;
    }

    /**
     * @return the itemRarity
     */
    public RarityTypes getItemRarity() {
        return itemRarity;
    }

    /**
     * @param itemRarity the itemRarity to set
     */
    public void setItemRarity(RarityTypes itemRarity) {
        this.itemRarity = itemRarity;
    }

    public enum ItemTypes
    {
        WEAPON, EQUIPMENT, CONSUMABLE, RELIGIOUS, CONTAINER
    }

    public enum RarityTypes
    {
        WHITE, GREEN, BLUE, PURPLE, ORANGE, RED
    }
}
