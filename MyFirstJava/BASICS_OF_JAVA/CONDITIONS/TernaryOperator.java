package BASICS_OF_JAVA.CONDITIONS;

public class TernaryOperator {
    public static void main(String[] args) {
        // Syntex :- variable = condition ? statement_1 : statement_2;

        // ex:- String type = (5%2 == 0)> "Even" : "Odd";

        int num = 5;

        String type = ((num % 2) == 0) ? "even" : "odd";
        

        System.out.println(type);
    }

}
