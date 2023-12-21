package BACKTRACKING;

public class PrintStringSubset {

    public static void printSubset(String str, String ans, int i) {
        // base case
        if (i > str.length()) {
            return;
        }

        if (i == str.length()) {
            if (ans.length() == 0) {
                System.out.println("null");
            } else {
                System.out.println(ans);
            }
            return;
        }

        // recursion
        // yes case
        printSubset(str, ans + str.charAt(i), i + 1);
        // no case
        printSubset(str, ans, i + 1);
    }

    public static void main(String[] args) {
        String str = "ABC";
        printSubset(str, "", 0);
    }
}
