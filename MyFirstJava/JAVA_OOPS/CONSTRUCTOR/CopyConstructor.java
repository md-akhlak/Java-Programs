package JAVA_OOPS.CONSTRUCTOR;

public class CopyConstructor {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "akhlak";
        s1.age = 19;
        Student s2 = new Student(s1);
        System.out.println(s1.name);

    }
}

class Student {
    String name;
    int roll;
    int age;
    int marks;

    Student() {
    }

    Student(String name, int roll) {
        this.name = name;
        this.roll = roll;

    }

    Student(Student s) {
        this.name = s.name;
        // this.roll = s.roll;
        this.age = s.age;
        // this.marks = s.marks;
    }

}