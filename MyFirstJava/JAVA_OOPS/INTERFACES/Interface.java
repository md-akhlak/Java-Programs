package JAVA_OOPS.INTERFACES;
/*
 * INTERFACES
 * -> All methods are public, abstract, and without implementation.
 * -> Used to achieve total abstraction.
 * -> Multiple Inheritace
 * -> Variables in the interface are final,, public and static. 
 */

interface Student {
    public void roll(int x);

    public void show();
}

interface CSE {
    public void roll(int x);

    public void show();
}

abstract class First {

}

class newStu extends First implements Student, CSE {
    public void roll(int x) {
        System.out.println("Roll is roll: " + x);
    }

    public void show() {
        System.out.println("Show method called");
    }
}

public class Interface {
    public static void main(String[] args) {
        Omnivours o1 = new Omnivours();
        o1.eatHerbs("green");
        o1.eatMeat("Fresh");




        newStu s1 = new newStu();
        s1.roll(3);
        s1.show();

    }
}

interface Herbivours {
    void eatHerbs(String f);
}

interface Carnivours {
    void eatMeat(String e);
}

class Omnivours implements Herbivours, Carnivours {
    public void eatHerbs(String f) {
        System.out.println("eat grass " + f);
    }

    public void eatMeat(String r) {
        System.out.println("eats meat " + r);
    }
}