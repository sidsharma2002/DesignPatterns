package oops.duckFamilyImpl3;

import oops.duckFamilyImpl2.behaviours.FlyBehaviour;
import oops.duckFamilyImpl2.behaviours.QuackBehaviour;
import oops.duckFamilyImpl2.behaviours.ducks.DefaultFlyingBehaviourImpl;
import oops.duckFamilyImpl2.behaviours.ducks.DefaultQuackBehaviourImpl;

public class CityDuck extends Duck {
    public CityDuck(FlyBehaviour flyBehaviour, QuackBehaviour quackBehaviour) {
        super.setFlyBehaviour(flyBehaviour);
        super.setQuackBehaviour(quackBehaviour);
    }

    public CityDuck() {
        super.setFlyBehaviour(new DefaultFlyingBehaviourImpl());
        super.setQuackBehaviour(new DefaultQuackBehaviourImpl());
    }
}
