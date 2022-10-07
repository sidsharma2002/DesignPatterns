# DesignPatterns [WIP + Contributions Accepted]


This repo is made as short notes to Head First Design Patterns Book.
Follow StoryNotes package and learn real software engineering.

![91bobQSPQrL](https://user-images.githubusercontent.com/53833109/194546022-1e5b29b8-e902-4223-95ef-29346929b321.jpg)

## Design Principles

### -----------    [DESIGN PRINCIPLE 1 ]    -----------
    " Identify the aspects of your application that vary and separate them from what stays the same. "

    All patterns are used for this only.
    example : here, as for in one step , default fly behaviour can change. Hence we encapsulated it (separated it).
    
### -----------    [DESIGN PRINCIPLE 2 ]    -----------
    
    " Program to an interface, not an implementation. "

    We already did that, eg : FlyBehaviour is an interface not an exact implementation, and we now can set different
    behaviours dynamically. another example is LoginRepository and TestDoubleRepository.

    Also this doesn't mean a java interface, it just means,  " program to a supertype. ".
    So an abstract class can also be used instead of an interface.

    eg : instead of,
            Dog dog = new Dog();
            dog.bark();

         use,
            Animal animal = new Dog();
            animal.makeSound();

         more better,
            Animal animal = getAnimal();  // delegate the responsibility to some another class/method.
            animal.makeSound();


### -----------    [DESIGN PRINCIPLE 3 ]    -----------

    " Favour Composition over Inheritance. " or " Favour HAS-A over IS-A"

    eg : class Manager implements Attitude, DressCode { // Manager "IS-A" Attitude
         }

         instead use,

         class Manager {
            Attitude attitude;  // Manager "HAS-A" Attitude
            DressCode dressCode;

            public void setAttitude() {
            }

            public void setDressCode() {
            }
         }

         This helps in dynamic change of attitude, dressCode. Also logically these interfaces are set of algorithms,
         and Manager class implementing this creates a sense that Manager is also an algorithm of this family.
         Instead of Manager becoming itself an algorithm it should use these.

  
