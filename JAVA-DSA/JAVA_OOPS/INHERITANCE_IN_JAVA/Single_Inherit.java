package JAVA_OOPS.INHERITANCE_IN_JAVA;

/*
Single base or Parent class to Derived class or Child class  
*/

public class Single_Inherit {
    public static void main(String[] args) {

        Derived d1 = new Derived();
        d1.displayDerivedClass();
        d1.displayBase();

    }
}

class Base {
    void displayBase() {
        System.out.println("This is Base class");
    }
}

class Derived extends Base {
    void displayDerivedClass() {
        super.displayBase();
        System.out.println("This is Derived class");
    }
}
