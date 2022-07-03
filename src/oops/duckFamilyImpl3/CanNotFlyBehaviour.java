package oops.duckFamilyImpl3;

import oops.duckFamilyImpl2.behaviours.FlyBehaviour;

public class CanNotFlyBehaviour implements FlyBehaviour {
    @Override
    public void fly() {
        System.out.println("I cannot fly");
    }
}
