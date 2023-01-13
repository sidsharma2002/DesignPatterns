package oops.decorator.coffeeShopImpl2.coffeeShopMenu;

import oops.decorator.coffeeShopImpl2.Beverage;

public class ChocoCoffee extends Beverage {

    public ChocoCoffee() {
        super.setCost(100);
        super.setDescription("Choco Coffee!!");
    }
}
