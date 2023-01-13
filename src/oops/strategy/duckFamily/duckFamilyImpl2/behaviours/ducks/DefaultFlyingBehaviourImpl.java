package oops.strategy.duckFamily.duckFamilyImpl2.behaviours.ducks;

import oops.strategy.duckFamily.duckFamilyImpl2.behaviours.FlyBehaviour;

/**
 * concrete implementation of default flying behaviour. Helps in code encapsulation and reUseAbility
 */
public class DefaultFlyingBehaviourImpl implements FlyBehaviour {

    @Override
    public void fly() {
        System.out.println("default flying behaviour");
    }
}
