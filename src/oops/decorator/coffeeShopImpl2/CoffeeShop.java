package oops.decorator.coffeeShopImpl2;

import oops.decorator.coffeeShopImpl2.coffeeShopMenu.ChocoCoffee;

public class CoffeeShop {
    public static void main(String[] args) {
        Beverage coffee = new ChocoCoffee();

        System.out.println(coffee.getTotalCost());

        // dynamically setting the addons

        coffee.setMocha(true);
        coffee.setChoco(true);
        coffee.notifyPropertiesChanged();

        System.out.println(coffee.getTotalCost());

        coffee.setCream(true);
        coffee.notifyPropertiesChanged();

        System.out.println(coffee.getTotalCost());
    }
}
