package oops.decorator.coffeeShopImpl1.coffeeShopMenu;

import oops.decorator.coffeeShopImpl1.Beverage;

public class ChocoCoffee extends Beverage {
    public ChocoCoffee() {
        super.setCost(300);
        super.setDescription("Choco Coffee!!");
    }
}
