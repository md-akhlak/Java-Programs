package Questions;

public class ReverseString {
    public static String reverse(String str) {
        if (str.isEmpty()) {
            return str;
        }
        return reverse(str.substring(1) + str.charAt(0));
    }

    public static void main(String[] args) {

        String str = "my name is mohammad Akhlak";
        System.out.println(reverse(str));

    }
}
