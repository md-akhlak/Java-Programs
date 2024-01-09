package JAVA_OOPS;

public class ClassesObjects {
    public static void main(String[] args) {

        Pen p1 = new Pen(); // object

        p1.setColor("Blue");
        System.out.println("The pen colo is : " + p1.color);
        p1.setTp(4);
        System.out.println("the pen tip is : " + p1.tip);
        // p1.color = "Red";
        // System.out.println(p1.color);

    }
}

// classes
class Pen {
    String color;
    int tip;

    void setColor(String newColor) {
        color = newColor;
    }

    void setTp(int newTip) {
        tip = newTip;
    }
}