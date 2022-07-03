package oops.duckFamilyImpl3;

import oops.duckFamilyImpl2.behaviours.FlyBehaviour;
import oops.duckFamilyImpl2.behaviours.QuackBehaviour;
import oops.duckFamilyImpl2.behaviours.ducks.DefaultFlyingBehaviourImpl;
import oops.duckFamilyImpl2.behaviours.ducks.DefaultQuackBehaviourImpl;

public class RubberDuck extends Duck {
    public RubberDuck(FlyBehaviour flyBehaviour, QuackBehaviour quackBehaviour) {
        super.setFlyBehaviour(flyBehaviour);
        super.setQuackBehaviour(quackBehaviour);
    }

    public RubberDuck() {
        super.setFlyBehaviour(new CanNotFlyBehaviour());    // default behaviour is canNotFly behaviour
        super.setQuackBehaviour(new SqueakBehaviour());
    }
}