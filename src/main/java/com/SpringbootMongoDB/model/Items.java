package com.SpringbootMongoDB.model;



public class Items {

    private String itemName;
    private String itemQuantity;

    private String itemUnit;

    private String itemAvailability;

    private String itemImage;


    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemQuantity() {
        return itemQuantity;
    }

    public void setItemQuantity(String itemQuantity) {
        this.itemQuantity = itemQuantity;
    }
    public String getItemUnit() {
        return itemUnit;
    }

    public void setItemUnit(String itemUnit) {
        this.itemUnit = itemUnit;
    }

    public String getItemAvailability() {
        return itemAvailability;
    }

    public void setItemAvailabilitye(String itemAvailability) {
        this.itemAvailability = itemAvailability;
    }

    public String getItemImage() {
        return itemImage;
    }

    public void setItemImage(String itemImage) {
        this.itemImage = itemImage;
    }

}
