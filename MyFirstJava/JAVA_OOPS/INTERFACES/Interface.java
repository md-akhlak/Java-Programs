package JAVA_OOPS.INTERFACES;
/*
 * INTERFACES
 * -> All methods are public, abstract, and without implementation.
 * -> Used to achieve total abstraction.
 * -> Multiple Inheritace
 * -> Variables in the interface are final,, public and static. 
 */

public class Interface {
    public static void main(String[] args) {
        Omnivours o1 = new Omnivours();
        o1.eatHerbs();
        o1.eatMeat();
    }
}

interface Herbivours {
    void eatHerbs();
}

interface Carnivours {
    void eatMeat();
}

class Omnivours implements Herbivours, Carnivours {
    public void eatHerbs() {
        System.out.println("eat grass");
    }

    public void eatMeat() {
        System.out.println("eats meat");
    }
}