package oops.strategy.duckFamily.duckFamilyImpl2.behaviours.ducks;

import oops.strategy.duckFamily.duckFamilyImpl2.behaviours.FlyBehaviour;
import oops.strategy.duckFamily.duckFamilyImpl2.behaviours.QuackBehaviour;

public class CityDuck extends Duck implements FlyBehaviour, QuackBehaviour {
    private FlyBehaviour flyBehaviour = new DefaultFlyingBehaviourImpl();
    private QuackBehaviour quackBehaviour = new DefaultQuackBehaviourImpl();

//  instead of this :
//    @Override
//    public void fly() {
//        System.out.println("city duck is flying");
//    }

    public void setFlyBehaviour(FlyBehaviour flyBehaviour) {
        this.flyBehaviour = flyBehaviour;
    }

    public void setQuackBehaviour(QuackBehaviour quackBehaviour) {
        this.quackBehaviour = quackBehaviour;
    }

    @Override
    public void fly() {
        flyBehaviour.fly();
    }

    @Override
    public void quack() {
        quackBehaviour.quack();
    }
}
