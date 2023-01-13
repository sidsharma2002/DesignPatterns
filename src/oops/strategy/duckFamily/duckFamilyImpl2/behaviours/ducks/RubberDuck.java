package oops.strategy.duckFamily.duckFamilyImpl2.behaviours.ducks;

import oops.strategy.duckFamily.duckFamilyImpl2.behaviours.QuackBehaviour;

public class RubberDuck extends Duck implements QuackBehaviour {

    private QuackBehaviour quackBehaviour = new DefaultQuackBehaviourImpl();

    @Override
    public void quack() {
        quackBehaviour.quack();     // delegating the implementation
    }

    public void setQuackBehaviour(QuackBehaviour quackBehaviour) {
        this.quackBehaviour = quackBehaviour;
    }
}