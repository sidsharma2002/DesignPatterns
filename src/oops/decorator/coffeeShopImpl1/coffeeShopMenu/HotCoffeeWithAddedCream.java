package oops.decorator.coffeeShopImpl1.coffeeShopMenu;

import oops.decorator.coffeeShopImpl1.Beverage;

public class HotCoffeeWithAddedCream extends Beverage {

    public HotCoffeeWithAddedCream() {
        Integer hotCoffeeCost = super.getCost();
        Integer addedCreamCost = 100;
        super.setCost(hotCoffeeCost + addedCreamCost);

        super.setDescription("Hot Coffee with added cream!!");
    }
}
