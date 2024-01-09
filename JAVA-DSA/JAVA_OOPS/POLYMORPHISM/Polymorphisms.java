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
        System.out.println(h1.legs);
        h1.eat();

        // the class whose name after new keyword those constructor or override fun is
        // called
        Animal a1 = new Cat(); // clas Cat eat() is called
        System.out.println(a1.legs);
        a1.eat();

        Horse h2 = new Cat(); // clas Cat eat() is called
        System.out.println(h2.legs);
        h2.eat();

        Cat c2 = new Human(); // clas Human eat() is called
        System.out.println(c2.legs = 2);
        c2.eat();

        // SmartPhone s = new MySmartPhoe();
        // System.out.println(s.getClass());

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
    int legs;

    void eat() {
        System.out.println("Eats anything");
    }
}

class Horse extends Animal {
    @Override
    void eat() {
        super.legs = 4;
        System.out.println("Eats grass");
    }
}

class Cat extends Horse {
    int legs = 4;

    @Override
    void eat() {
        super.legs = 4;
        System.out.println("drinks milk");
    }
}

class Human extends Cat {
    void eat() {
        super.legs = 2;
        System.out.println("eats everything");
    }
}

interface CellPhone {
    void Battery(int x);

    void Speacker();
}

interface Camera {
    void cam();

    void HD();
}

interface SmartPhone extends CellPhone, Camera {
    void Gallery();

    void Watch();

    void alarm();
}

class MySmartPhoe implements SmartPhone {
    public void Battery(int x) {
        System.out.println("BAttery is : " + x);
    }

    public void Speacker() {
        System.out.println("can be used as speacker");
    }

    public void cam() {
        System.out.println("can be used as camera");
    }

    public void HD() {
        System.out.println("Click HD photos");
    }

    public void Gallery() {
        System.err.println("Open gallery");
    }

    public void Watch() {
        System.err.println("Can be used as watch");
    }

    public void alarm() {
        System.err.println("Can be used a alarm ");
    }

}
