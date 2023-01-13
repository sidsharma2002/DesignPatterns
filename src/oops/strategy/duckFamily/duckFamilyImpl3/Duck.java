package oops.strategy.duckFamily.duckFamilyImpl3;

import oops.strategy.duckFamily.duckFamilyImpl2.behaviours.FlyBehaviour;
import oops.strategy.duckFamily.duckFamilyImpl2.behaviours.QuackBehaviour;

public class Duck {
    private FlyBehaviour flyBehaviour;
    private QuackBehaviour quackBehaviour;

    public void setFlyBehaviour(FlyBehaviour flyBehaviour) {
        this.flyBehaviour = flyBehaviour;
    }

    public void setQuackBehaviour(QuackBehaviour quackBehaviour) {
        this.quackBehaviour = quackBehaviour;
    }

    public void performFly() {
        flyBehaviour.fly(); // delegating fly responsibility to fly behaviour
    }

    public void performQuack() {
        quackBehaviour.quack(); // delegating quack responsibility to quack behaviour
    }

    public void sleep() {
        System.out.println("base duck sleep");
    }

    public void eat() {
        System.out.println("base duck eat");
    }

    // public void ....,  there can be 100s of more such methods.
}
