package JAVA_OOPS;

public class Inheritance {
    public static void main(String[] args) {
        Lion l1 = new Lion();
        l1.name = "girrafe";
        // l1.color();
        l1.animalName();
        // l1.eat();



        

    }
}

class Animal {

    String name;

    void animalName() {
        System.out.println("name is name" + name);
    }

    void color() {
        System.out.println("color is color");
    }
}

class Lion extends Animal {
    void eat() {
        System.out.println("eats meat");
    }
}
