package oops.strategy.duckFamily.duckFamilyImpl3;

import oops.strategy.duckFamily.duckFamilyImpl2.behaviours.QuackBehaviour;

public class SqueakBehaviour implements QuackBehaviour {
    @Override
    public void quack() {
        System.out.println("I am squeaking");
    }
}
