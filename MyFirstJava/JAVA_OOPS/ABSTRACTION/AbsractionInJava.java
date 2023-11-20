package JAVA_OOPS.ABSTRACTION;

public class AbsractionInJava {
    public static void main(String[] args) {

    }
}

/*
 * Absraction :- Hiding all the Unnecessary details and showing only the
 * important parts to the user
 * 
 * It can be implemented using two ways :- Abstract class and Interfaces
 */

abstract class BaseClass {
    void display() {
        System.out.println("This is Base class");
    }

    // abstract void color() {
    // }
}

class Derived extends BaseClass {
    void color() {
    }
}
