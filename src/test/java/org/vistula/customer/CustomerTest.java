package org.vistula.customer;

import org.junit.Test;
import org.vistula.basket.BasketItem;
import org.vistula.basket.PromoItem;

public class CustomerTest {

    @Test
    public void testOne(){
        Customer Tomek = new Customer ("Tomek", "Paździoch", 18);
        assert Tomek.adultCheck() == true;
    }



    @Test
    public void testTwo(){
        Customer Romek = new Customer ();
        Romek.setAge(19);
        assert Romek.adultCheckif() == true;
    }

    @Test
    public void testTree (){
        BasketItem czekolada = new BasketItem(18,false, "czekolada");
        BasketItem vodka = new BasketItem(9, true, "vódka" );
        Customer Romek = new Customer("Romek", "bal", 15);
        Romek.addToBasket(vodka);
        Romek.addToBasket(czekolada);
        assert Romek.basketTest() == true;
    }

    @Test
    public void testFour (){
        BasketItem czekolada = new BasketItem(18,false, "czekolada");
        BasketItem vodka = new BasketItem(9, true, "vódka" );
        Customer Romek = new Customer("Romek", "bal", 15);
        Romek.addToBasket(vodka);
        Romek.addToBasket(czekolada);
        assert Romek.priceSum() == 27;
        //assert Romek.basketTest() == true;
    }

    @Test
    public void testFive (){
        BasketItem czekolada = new BasketItem(18,false, "czekolada");
        BasketItem vodka = new BasketItem(9, true, "vódka" );
        Customer Romek = new Customer("Romek", "bal", 15);
        Romek.addToBasket(vodka);
        Romek.addToBasket(czekolada);
        Romek.printItems();
    }



    @Test
    public void testSix (){
        BasketItem czekolada = new BasketItem(18,false, "czekolada");
        BasketItem vodka = new BasketItem(9, true, "vódka" );
        Customer Romek = new Customer("Romek", "bal", 15);
        Romek.addToBasketIfAdult(vodka);
        Romek.addToBasketIfAdult(czekolada);
        Romek.printItems();
    }

    @Test
    public void testSeven(){
        BasketItem czekolada = new BasketItem(18,false, "czekolada");
        BasketItem vodka = new BasketItem(9, true, "vódka" );
        Customer Romek = new Customer("Romek", "bal", 15);
        Romek.addToBasket(vodka);
        Romek.addToBasket(czekolada);
        Romek.subFromBasket();
        Romek.addToBasket(czekolada);
        Romek.printItems();


    }

    @Test
    public void testEight(){
        PromoItem czekolada = new PromoItem(24, false, "czekolada", (float) 0.25);
        BasketItem vodka = new BasketItem(9, true, "vódka" );
        Customer Romek = new Customer("Romek", "bal", 15);
        Romek.addToBasket(czekolada);
        Romek.addToBasket(vodka);
        Romek.printItems();
        assert Romek.priceSum() == 27;
    }


}
