package InteviewQuestions;

// amazon , google, facebook;

// using string
public class StringCompression {

    public static String compressedString(String str) {
        String newStr = "";
        for (int i = 0; i < str.length(); i++) {
            Integer count = 1;
            while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
            }
            newStr += str.charAt(i);
            if (count > 1) {
                newStr += count.toString();
            }

        }

        return newStr;
    }

    // using stringBuilder

    public static String compress(String str) {

        return str;

    }

    public static void main(String[] args) {

        String str = "aaabbssdefggg";
        System.out.println(compressedString(str));

    }
}
