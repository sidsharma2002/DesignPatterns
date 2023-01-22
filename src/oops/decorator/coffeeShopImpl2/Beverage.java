package oops.decorator.coffeeShopImpl2;

import oops.decorator.coffeeShopImpl2.coffeeShopMenu.CostOfAddons;

abstract public class Beverage {

    private String description;
    private Integer cost = 0;
    private Integer costOfProperties = 0;

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCost(Integer cost) {
        this.cost = cost;
    }

    public String getDescription() {
        return description;
    }

    public Integer getTotalCost() {
        return cost + costOfProperties;
    }

    public Integer getCostOfProperties() {
        return costOfProperties;
    }

    public void notifyPropertiesChanged() {
        calculateCostOfProperties();
    }

    private void calculateCostOfProperties() {
        costOfProperties = 0;

        if (mocha) {
            costOfProperties += CostOfAddons.mocha;
        }

        if (choco) {
            costOfProperties += CostOfAddons.choco;
        }

        if (cream) {
            costOfProperties += CostOfAddons.cream;
        }

        if (whippedMilk) {
            costOfProperties += CostOfAddons.whippedMilk;
        }

        // ... and so on
    }

    ////////// Beverage Properties //////////

    private Boolean mocha = false;
    private Boolean choco = false;
    private Boolean cream = false;
    private Boolean whippedMilk = false;
    // and 100s of such properties..

    public void setMocha(Boolean mocha) {
        this.mocha = mocha;
    }

    public void setChoco(Boolean choco) {
        this.choco = choco;
    }

    public void setCream(Boolean cream) {
        this.cream = cream;
    }

    public void setWhippedMilk(Boolean whippedMilk) {
        this.whippedMilk = whippedMilk;
    }
}
