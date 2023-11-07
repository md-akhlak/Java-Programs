package InteviewQuestions;

public class StringIsPalindrome {
    public static boolean isPalindrome(String str) {

        for (int i = 0; i < str.length() / 2; i++) {
            int n = str.length();
            if (str.charAt(i) != str.charAt(n - i - 1)) {
                System.out.println("not palindrome" + str);
                return false;
            }
        }
        System.out.println("Palindrome : " + str);
        return true;

    }

    public static void main(String[] args) {

        String name = "nitin";

        isPalindrome(name);

    }
}
