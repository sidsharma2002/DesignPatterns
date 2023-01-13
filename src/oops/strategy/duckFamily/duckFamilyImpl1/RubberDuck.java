package oops.strategy.duckFamily.duckFamilyImpl1;

public class RubberDuck extends Duck {

    /**
     * As I went directly and changed the duck class to added fly method,
     * This class also got changed and now rubber duck started flying which is a bug.
     * Hence, Now I came back here getting a "bug on prod" and overridden this fly and remove super.fly()
     */
    @Override
    public void fly() {
        // commented out super.fly to remove base fly behaviour in this class.
        System.out.println("I cannot fly");
    }
}
