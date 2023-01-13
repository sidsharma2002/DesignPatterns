package oops.strategy.duckFamily.duckFamilyImpl3;

import oops.strategy.duckFamily.duckFamilyImpl2.behaviours.FlyBehaviour;
import oops.strategy.duckFamily.duckFamilyImpl2.behaviours.QuackBehaviour;

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