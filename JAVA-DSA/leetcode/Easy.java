package leetcode;

import java.util.HashMap;

public class Easy {

    int sum = 0;

    Node root = null;

    public Easy() {
    }

    class Node {
        Node left;
        int value;
        Node right;

        public Node() {
        }

        public Node(int value, Node left, Node right) {
            this.value = value;
            this.left = left;
            this.right = right;
        }

    }

    public static int firstUniqChar(String s) {
        int[] count = new int[26];

        for (int i = 0; i < s.length(); i++) {
            int index = s.charAt(i) - 'a';
            count[index]++;
        }

        for (int i = 0; i < s.length(); i++) {
            int index = s.charAt(i) - 'a';
            if (count[index] == 1) {
                return i;
            }
        }

        return -1;

    }

    public static boolean isPowerOfTwo(int n) {
        if (n == 0)
            return false;
        if (n == 1)
            return true;

        if (n % 2 == 0)
            return isPowerOfTwo(n / 2);
        else
            return false;
    }

    // https://leetcode.com/problems/balanced-binary-tree/description/

    // balanced binary tree
    public static int height(Node root) {
        if (root == null) {
            return 0;
        }
        return Math.max(height(root.left), height(root.right));
    }

    public void inordrUtil(Node root, boolean ans) {
        if (root != null) {
            inordrUtil(root.left, ans);

            int h1 = height(root.left);
            int h2 = height(root.right);

            if (Math.abs(h1 - h2) > 1) {
                ans = ans && false;
            }

            inordrUtil(root.right, ans);
        }
    }

    public boolean isBalanced(Node root) {

        boolean ans = true;
        inordrUtil(root, ans);
        return true;

    }

    // count left node
    public int countLeft(Node root) {
        if (root == null)
            return 0;
        healper(root);
        return sum;
    }

    private void healper(Node root) {
        if (root == null)
            return;
        if (isLeafNode(root.left)) {
            sum = sum + root.left.value;
        }
        healper(root.left);
        healper(root.right);
    }

    private boolean isLeafNode(Node root) {
        if (root == null) {
            return false;
        }
        if (root.left == null && root.right == null) {
            return true;
        }
        return false;
    }

    public static String reverseString(String str) {
        int left = 0;
        int right = str.length() - 1;

        StringBuilder sb = new StringBuilder(str);

        while (left < right) {
            char temp = str.charAt(left);
            sb.setCharAt(left, sb.charAt(right));
            sb.setCharAt(right, temp);
        }

        return sb.toString();
    }

    public static String reverseStringWords(String str) {
        String words[] = str.split("\\str+");

        StringBuilder sb = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            sb.append(words[i]);
            if (i != 0) {
                sb.append(" ");
            }
        }

        String result = sb.toString().trim();

        return result;
    }

    public static void reverseCharString(char ch[]) {
        int left = 0;
        int right = ch.length - 1;

        while (left < right) {
            char temp = ch[left];
            ch[left] = ch[right];
            ch[right] = temp;

            left++;
            right--;
        }
    }

    // https://leetcode.com/problems/move-zeroes/
    public static void moveZeroes(int[] nums) {
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                if (i != j) {
                    nums[j] = nums[i];
                    nums[i] = 0;
                }
                j++;
            }
        }
    }

    // https://leetcode.com/problems/number-of-senior-citizens/
    public static int countSeniors(String[] citizens) {
        int senior = 0;
        for (String str : citizens) {
            if (str.charAt(11) > '6' || str.charAt(11) == '6'
                    && str.charAt(12) > '0') {
                senior++;
            }
        }
        return senior;
    }

    // https://leetcode.com/problems/two-sum/
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (map.containsKey(complement)) {
                return new int[] {
                        map.get(complement), i
                };
            }

            map.put(complement, i);
        }

        return new int[0];

    }

    public static void main(String[] args) {
        String s = "loveleetcode";

        System.out.println(firstUniqChar(s));

    }
}
