package JAVA_OOPS.ABSTRACTION;

/*
 * Absraction :- Hiding all the Unnecessary details and showing only the
 * important parts to the user
 * 
 * It can be implemented using two ways :- Abstract class and Interfaces
 */

/*
 * -> cannot create an instance of abstract class
 * -> can have abstract/non-abstract methods
 * -> can have constructor
 */

abstract class Student {
    public void name(String name) {
        System.out.println("The name is : " + name);
    }

    abstract void roll(int roll);
}

class Identity extends Student {
    public void roll(int roll) {
        System.out.println("roll is : " + roll);
    }
}

public class AbsractionInJava {
    public static void main(String[] args) {
        // Horse h1 = new Horse();
        // h1.eat();
        // h1.walk();
        // h1.color = "red";
        // System.out.println(h1.color);

        // Chicken c1 = new Chicken();
        // c1.eat();
        // c1.walk();
        // c1.color = "pink";
        // System.out.println(c1.color);

        Identity i = new Identity();
        i.name("AKhlak");
        i.roll(2);

    }
}

abstract class Animal {
    String color;

    Animal() {
        color = "brown";
    }

    void eat() {
        System.out.println("animal eats");
    }

    abstract void walk();
}

class Horse extends Animal {
    void color() {
        color = "White";
    }

    void walk() {
        System.out.println("Horse have four legs");
    }
}

class Chicken extends Animal {
    void color() {
        color = "yellow";
    }

    void walk() {
        System.out.println("walk on 2 legs");
    }
}
