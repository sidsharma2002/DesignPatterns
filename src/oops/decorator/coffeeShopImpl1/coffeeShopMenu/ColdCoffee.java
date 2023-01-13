package oops.decorator.coffeeShopImpl1.coffeeShopMenu;

import oops.decorator.coffeeShopImpl1.Beverage;

public class ColdCoffee extends Beverage {

    public ColdCoffee() {
        super.setCost(200);
        super.setDescription("Cold Coffee!!");
    }
}
