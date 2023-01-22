package oops.decorator.coffeeShopImpl1.coffeeShopMenu;

import oops.decorator.coffeeShopImpl1.Beverage;

public class HotCoffeeWithWhippedMilk extends HotCoffee {
    public HotCoffeeWithWhippedMilk() {
        Integer hotCoffeeCost = super.getCost();
        Integer costOfWhippedMilk = 50;
        super.setCost(hotCoffeeCost + costOfWhippedMilk);

        super.setDescription("Hot Coffee with whipped milk!!");
    }
}
