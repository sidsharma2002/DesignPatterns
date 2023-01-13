package oops.strategy.duckFamily.duckFamilyImpl3;

import oops.strategy.duckFamily.duckFamilyImpl2.behaviours.FlyBehaviour;

public class CanNotFlyBehaviour implements FlyBehaviour {
    @Override
    public void fly() {
        System.out.println("I cannot fly");
    }
}
