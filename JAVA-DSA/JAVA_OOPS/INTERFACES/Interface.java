package JAVA_OOPS.INTERFACES;
/*
 * INTERFACES
 * -> All methods are public, abstract, and without implementation.
 * -> Used to achieve total abstraction.
 * -> Multiple Inheritace
 * -> Variables in the interface are final, public and static. 
 */

interface Student {
    public void roll(int x);

    public void show();
}

// interface CSE {
//     public void roll(int x);

//     public void show();
// }


class newStu implements Student {
    public void roll(int x) {
        System.out.println("Roll is roll: " + x);
    }

    public void show() {
        System.out.println("Show method called");
    }
}

public class Interface {
    public static void main(String[] args) {
        // Omnivours o1 = new Omnivours();
        // o1.eatHerbs("green");
        // o1.eatMeat("Fresh");

        // newStu s1 = new newStu();
        // s1.roll(3);
        // s1.show();


        GPS obj = new SmartPhone();

        obj.getCamera();
        obj.getGPS();
        obj.getNetworks();
        obj.getWIFI();
        obj.getClass();






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






interface CellPhone {
    void getNetworks();
    void getCamera();

}

interface GPS extends CellPhone {
    void getGPS();
    void getWIFI();
    
}

class SmartPhone implements GPS {
    public void getNetworks() {
        System.err.println("start netword");
    }

    public void getCamera() {
        System.err.println("Open camera");
    }

    public void getGPS() {
        System.out.println("Open gps");
    }

    public void getWIFI() {
        System.err.println("Open wifi");
    }

}