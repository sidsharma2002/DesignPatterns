package oops.duckFamilyImpl3;

import oops.duckFamilyImpl2.behaviours.QuackBehaviour;

public class SqueakBehaviour implements QuackBehaviour {
    @Override
    public void quack() {
        System.out.println("I am squeaking");
    }
}
