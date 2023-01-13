package oops.strategy.duckFamily.duckFamilyImpl3;

public class DuckOwner {
    public static void main(String[] args) {
        Duck cityDuck = new CityDuck();
        cityDuck.performFly();  // now we can call fly on Duck also
        cityDuck.performQuack();

        Duck rubberDuck = new RubberDuck();
        rubberDuck.performFly();
        rubberDuck.performQuack();
    }
}
