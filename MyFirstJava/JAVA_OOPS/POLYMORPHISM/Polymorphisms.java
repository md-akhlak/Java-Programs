package JAVA_OOPS.POLYMORPHISM;

/*
 * Polymorphisms :- Poly means many , morph means forms
 * -> Two types of polymorphisms :-
 * 1) Complile Time Polymorphisms (Static)
 * -> Method Overloading :- A funtion with same name but differ parameters
 * 
 * 2) Runtime Polymorphisms(Dynamic)
 * -> Method Overriding :- Parent and Child class bpth contain the same funtion
 * with a different Defination
 */
public class Polymorphisms {
    public static void main(String[] args) {
        Sum s1 = new Sum();
        System.out.println(s1.sum(1, 3));
        System.out.println(s1.sum((float) 8.3, (float) 4.2));
        System.out.println(s1.sum(3.2f, 4.2f));
        System.out.println(s1.sum(2, 4, 6));

        Horse h1 = new Horse();
        h1.eat();
    }
}

class Sum {
    // Method Overloading
    int sum(int a, int b) {
        return a + b;
    }

    int sum(int a, int b, int c) {
        return a + b + c;
    }

    float sum(float a, float b) {
        return a + b;
    }

}

class Animal {
    void eat() {
        System.out.println("Eats anything");
    }
}

class Horse extends Animal {
    void eat() {
        System.out.println("Eats grass");
    }
}