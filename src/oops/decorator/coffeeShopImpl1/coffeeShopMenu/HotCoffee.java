package oops.decorator.coffeeShopImpl1.coffeeShopMenu;

import oops.decorator.coffeeShopImpl1.Beverage;

public class HotCoffee extends Beverage {

    public HotCoffee() {
        super.setCost(100);
        super.setDescription("Hot Coffee!!");
    }

}
