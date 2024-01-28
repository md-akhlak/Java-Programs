package InteviewQuestions;

class LongestCommonPrefix {

    public static String longestCommonPrefix(String[] str) {
        return longestCommonPrefix(str, 0, str.length - 1);
    }

    private static String longestCommonPrefix(String[] str, int l, int r) {
        if (l == r) {
            return str[l];
        }

        int mid = l + (r - l) / 2;

        String left = longestCommonPrefix(str, l, mid);
        String right = longestCommonPrefix(str, mid + 1, r);
        return commonPrefix(left, right);
    }

    private static String commonPrefix(String left, String right) {
        int min = Math.min(left.length(), right.length());

        for (int i = 0; i < min; i++) {
            if (left.charAt(i) != right.charAt(i)) {
                return left.substring(0, i);
            }
        }

        return left.substring(0, min);
    }

    public static void main(String[] args) {
        String[] str = {"flower", "flow", "flight"};
        System.out.println(longestCommonPrefix(str));
    }


}
