package oops.strategy.duckFamily.duckFamilyImpl2.behaviours.ducks;

import oops.strategy.duckFamily.duckFamilyImpl2.behaviours.QuackBehaviour;

public class DefaultQuackBehaviourImpl implements QuackBehaviour {
    @Override
    public void quack() {
        System.out.println("default quacking behaviour");
    }
}
