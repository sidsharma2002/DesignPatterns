package oops.duckFamilyImpl2.behaviours.ducks;

import oops.duckFamilyImpl2.behaviours.QuackBehaviour;

public class RubberDuck extends Duck implements QuackBehaviour {

    @Override
    public void quack() {
        System.out.println("rubber duck is quacking");
    }
}