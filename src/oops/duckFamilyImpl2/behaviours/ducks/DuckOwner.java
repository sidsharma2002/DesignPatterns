package oops.duckFamilyImpl2.behaviours.ducks;

public class DuckOwner {
    public static void main(String[] args) {
        CityDuck cityDuck = new CityDuck(); // Type is fixed, cityDuck can't be replaced with anything else dynamically
        cityDuck.setFlyBehaviour(new DefaultFlyingBehaviourImpl());
        cityDuck.setQuackBehaviour(new DefaultQuackBehaviourImpl());

        cityDuck.fly();
        cityDuck.quack();

        RubberDuck rubberDuck = new RubberDuck(); // Type is fixed, rubberDuck can't be replaced with anything else dynamically
        rubberDuck.setQuackBehaviour(new DefaultQuackBehaviourImpl());

        rubberDuck.quack();
    }
}
