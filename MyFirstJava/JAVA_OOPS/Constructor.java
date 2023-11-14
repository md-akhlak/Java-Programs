package JAVA_OOPS;

/*
Constructor is a special method invoked automatically  at the time of
object creation.

-> Constructor have the same name as the class name or sructure
-> Constructor don't have a return type.
-> Constructors are only called once, at object creaation time.
-> Memory allocation happens when constructor is called.
*/

public class Constructor {
    public static void main(String[] args) {

        Student s1 = new Student();
        Student s2 = new Student("Akhlak");

    }
}

class Student {
    String name;
    int roll;

    // non-parameterised constructor
    Student() {
        System.out.println("Default Constructor is called");
    }

    // parameterised constructor
    Student(String name) {
        this.name = name;
        // System.out.println("parameterised constructor is called");
    }

    

}