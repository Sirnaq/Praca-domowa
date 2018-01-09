package org.vistula.basket;

public class BasketItem {

    public float price;
    boolean ageRestrictedItem;
    String name;

    public BasketItem(float price, boolean ageRestrictedItem, String name) {
        this.price = price;
        this.ageRestrictedItem = ageRestrictedItem;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public BasketItem(){}

    public float getPrice() {
        return price;
    }

    public boolean isAgeRestrictedItem() {
        return ageRestrictedItem;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setAgeRestrictedItem(boolean ageRestrictedItem) {
        this.ageRestrictedItem = ageRestrictedItem;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float sumOfProducts(){
        float sumOfProductsResult = price;
        return sumOfProductsResult;
    }
}
