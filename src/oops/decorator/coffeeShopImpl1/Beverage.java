package oops.decorator.coffeeShopImpl1;

abstract public class Beverage {
    private String description;
    private Integer cost;

    public String getDescription() {
        return description;
    }

    public Integer getCost() {
        return cost;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCost(Integer cost) {
        this.cost = cost;
    }
}