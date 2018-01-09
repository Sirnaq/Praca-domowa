package org.vistula.customer;

import org.vistula.basket.BasketItem;

import java.util.ArrayList;
import java.util.List;

public class Customer {

    private String firstName;
    private String lastName;
    private int age;
    //private List<BasketItem> basket;
    private ArrayList<BasketItem> basket = new ArrayList<BasketItem>();

    /*
    public Customer(String firstName, String lastName, int age, List<BasketItem> basket) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.basket = basket;
    }
    */

    public Customer(){}

    public Customer(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.basket = basket;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public List<BasketItem> getBasket() {
        return basket;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setBasket(List<BasketItem> basket) {
        this.basket = (ArrayList<BasketItem>) basket;
    }

    public boolean adultCheck (){
        boolean adultCheckResult = age >= 18;
        return adultCheckResult;
    }

    public boolean adultCheckif (){
        if (age >= 18){
            return true;
        }else {
            return false;
        }
    }

    public void addToBasket(BasketItem item){
        basket.add(item);
    }


    public void addToBasketIfAdult(BasketItem item){
        boolean restricted = item.isAgeRestrictedItem();
        if (age >= 18 && restricted || !restricted){
            basket.add(item);
            System.out.println();
        }else {
            System.out.println(basket);
        }

    }

    public void subFromBasket(){
        basket = new ArrayList<BasketItem>();

    }

    public boolean basketTest (){
        System.out.print(basket.size());
        if (basket.size() > 0){
            return true;
        }else
        {
            return false;
        }
    }

    public float priceSum(){
        float priceSumResult = 0;
        int sizeOfBasketArray = basket.size();
        for (int i=0; i<sizeOfBasketArray; i++) {
            priceSumResult += basket.get(i).getPrice();

        }
        System.out.print(priceSumResult);
        return priceSumResult;
    }

    public void printItems(){

        int sizeOfBasketArray = basket.size();
        for (int i=0; i<sizeOfBasketArray; i++) {
            System.out.println(basket.get(i).getName());

        }
    }
}
