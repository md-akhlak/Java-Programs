package leetcode;

public class Median {
    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        return rec(l1, l2);
    }

    public ListNode rec(ListNode l1, ListNode l2) {

        if (l1 == null && l2 == null) {
            return null;
        }

        if (l1 == null) {
            l1 = new ListNode(0);
        }

        if (l2 == null) {
            l2 = new ListNode(0);
        }

        int value = l1.val + l2.val;

        if (value > 9) {
            value = value % 10;
            if (l1.next == null) {
                l1.next = new ListNode(1);
            } else {
                l1.next.val = l1.next.val + 1;
            }
        }

        return new ListNode(value, rec(l1.next, l2.next));
    }

    //https://leetcode.com/problems/longest-common-prefix/description/
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

//        String[] str2 = {"dog", "racecar", "car"};
//        System.out.println(longestCommonPrefix(str2));

    }
}
