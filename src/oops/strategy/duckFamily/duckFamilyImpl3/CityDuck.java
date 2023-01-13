package oops.strategy.duckFamily.duckFamilyImpl3;

import oops.strategy.duckFamily.duckFamilyImpl2.behaviours.FlyBehaviour;
import oops.strategy.duckFamily.duckFamilyImpl2.behaviours.QuackBehaviour;
import oops.strategy.duckFamily.duckFamilyImpl2.behaviours.ducks.DefaultFlyingBehaviourImpl;
import oops.strategy.duckFamily.duckFamilyImpl2.behaviours.ducks.DefaultQuackBehaviourImpl;

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
