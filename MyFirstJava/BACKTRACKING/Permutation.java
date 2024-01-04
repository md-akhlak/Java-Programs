package BACKTRACKING;

public class Permutation {
    public static void printPermutation(String str, String ans) {
        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            char curr = str.charAt(i);
            String newStr = str.substring(0, i) + str.substring(i + 1);
            printPermutation(newStr, ans + curr);

        }

    }

    public static void perm(String str, int low, int high) {
        if (low == high) {
            System.out.println(str);
        } else {
            for (int i = low; i <= high; i++) {
                str = swap(str, low, i);
                perm(str, low + 1, high);
                str = swap(str, low, i);
            }
        }
    }

    public static String swap(String str, int i, int j) {
        char temp;
        char tempArr[] = str.toCharArray();
        temp = tempArr[i];
        tempArr[i] = tempArr[j];
        tempArr[j] = temp;

        // The line `return String.valueOf(tempArr);` is converting the character array `tempArr` back
        // into a string. It is using the `valueOf()` method of the `String` class to do this
        // conversion. This is necessary because the `swap()` method is swapping characters in a
        // character array, so in order to return the modified string, it needs to be converted back
        // from a character array to a string.
         return String.valueOf(tempArr);

    }

    public static void main(String[] args) {
        String str = "ABC";

        System.out.println("using function");
        printPermutation(str, "");

        System.out.println();

        System.out.println("using swap");
        perm(str, 0, str.length() - 1);
    }
}
