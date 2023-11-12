package JAVA_OOPS;

// this keyword is used to refer to the current object 

public class GetSet {
    public static void main(String[] args) {

        Animal an = new Animal();
        an.setName("lion");
        System.out.println(an.getName());
        an.setColor("yellow");
        System.out.println(an.getColor());

    }

}

// classes
class Animal {
    private String name;
    private String color;

    void setName(String name) {
        this.name = name;
    }

    void setColor(String color) {
        this.color = color;
    }

    String getName() {
        return this.name;
    }

    String getColor() {
        return this.color;
    }

}