package JAVA_OOPS;

public class DynamicDispatch {
    public static void main(String[] args) {
        Base objBase = new Derived(); // derives class called in override case
        objBase.run();

        Base obj = new Derived();
        obj.printMess(); // we can call only base class methods bcoz obj is of base class




        
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

    }
}

class Base {
    void run() {
        System.err.println("Base class called");
    }

    void printMess() {
        System.out.println("hello from base class");
    }
}

class Derived extends Base {
    @Override
    void run() {
        System.out.println("Derived class called");
    }

    void print() {
        System.out.println("Hello from derived class");
    }
}

//

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
