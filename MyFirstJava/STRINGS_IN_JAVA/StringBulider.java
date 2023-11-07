package STRINGS_IN_JAVA;

public class StringBulider {
    public static void main(String[] args) {

        StringBuilder s = new StringBuilder("");
        for (char c = 'A'; c <= 'Z'; c++) {
            s.append(c);
        }
        System.out.println(s);
        System.out.println(s.length());
    }
}
