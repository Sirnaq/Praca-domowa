package org.vistula.basket;

import org.vistula.basket.BasketItem;

public class PromoItem extends BasketItem {
    private double promocja;

    public void setPromocja(float promocja) {
        this.promocja = promocja;
    }

    public PromoItem(float price, boolean ageRestrictedItem, String name, float promocja) {
        super(price, ageRestrictedItem, name);
        this.promocja = promocja;
    }

    @Override
    public float getPrice() {
       float price = (float) (this.price * (1- promocja));
       return price;

    }

}
