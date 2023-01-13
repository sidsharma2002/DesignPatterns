package oops.strategy.duckFamily.duckFamilyImpl2.behaviours;

/**
 * used to define fly behaviour.
 * note that now every class inheriting this should implement so no code reuse.
 * Due to which, if something changes in the fly behaviour implementation,
 * I need to track all classes that implement this and change code there.
 *
 * Hence, more bugs on prod.
 *
 * to avoid this, we can encapsulate the same code in defaultFlyBehaviourImpl class.
 */
public interface FlyBehaviour {
    public void fly();
}
