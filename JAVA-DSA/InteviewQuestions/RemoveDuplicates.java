package InteviewQuestions;

// asked in google/microsoft test series.
public class RemoveDuplicates {
    public static void duplicateString(String str, int i, StringBuilder newStr, boolean map[]) {
        if (i == str.length()) {
            System.out.println(newStr);
            return;
        }
        // work
        char curEle = str.charAt(i);
        if (map[curEle - 'a'] == true) {
            // duplicate found
            duplicateString(str, i + 1, newStr, map);
        } else {
            map[curEle - 'a'] = true;
            duplicateString(str, i + 1, newStr.append(curEle), map);
        }
    }

    public static void main(String[] args) {
        String str = "mohammadakhlak";
        duplicateString(str, 0, new StringBuilder(""), new boolean[26]);
    }
}
