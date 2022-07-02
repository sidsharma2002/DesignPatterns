package oops.duckFamilyImpl1;

public class Duck {

    public void sleep() {
        System.out.println("base duck sleep");
    }

    public void eat() {
        System.out.println("base duck eat");
    }

    // public void ....,  there can be 100s of more such methods

    /**
     * a requirement came to make ducks quack also,
     * so I just came in here and added a quack method.
     */
    public void quack() {
        System.out.println("base duck quack");
    }

    /**
     * a requirement came to make ducks fly also,
     * so I just came in here and added a fly method.
     */
    public void fly() {
        System.out.println("base duck fly");
    }
}