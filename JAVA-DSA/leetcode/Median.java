package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class Median {
    public class ListNode {
        int val;
        ListNode next;
        ListNode left;
        ListNode right;
        ListNode random;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
            this.left = null;
            this.right = null;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    ListNode root = null;

    public ListNode swap(ListNode left, ListNode right){
        ListNode temp = root;

        while(temp != null){
            temp = left.left;
            left.left = right.right;
            right.right = temp;
        }

        return temp;
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

    // https://leetcode.com/problems/longest-common-prefix/description/
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

    public static int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;

        while (left < right) {
            int diffrence = right - left;
            int curArea = Math.min(height[left], height[right]) * diffrence;
            maxArea = Math.max(maxArea, curArea);
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxArea;
    }

    // elevate reverse polish notation
    public static int evalRPN(String[] tokens) {
        // string to integer
        Stack<Long> st = new Stack<>();
        for (int i = 0; i < tokens.length; i++) {
            if (tokens[i].length() == 1 && tokens[i].charAt(0) < 48) {
                long num2 = st.pop();
                long num1 = st.pop();
                char ch = tokens[i].charAt(0);
                long result = resolves(num1, num2, ch);
                st.push(result);
            } else {
                st.push(Long.parseLong(tokens[i]));
            }
        }
        System.out.println(evalRPN(tokens));
        return st.pop().intValue();

    }

    private static long resolves(long num1, long num2, char ch) {
        if (ch == '+')
            return num1 + num2;
        else if (ch == '-')
            return num1 - num2;
        else if (ch == '*')
            return num1 * num2;
        else
            return num1 / num2;
    }

    // https://leetcode.com/problems/binary-tree-level-order-traversal/
    // level order traversal

    public List<List<Integer>> levelOrder(ListNode root) {

        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }

        Queue<ListNode> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            int size = q.size();
            List<Integer> list = new ArrayList<>();

            for (int i = 0; i < size; i++) {
                ListNode node = q.remove();
                list.add(node.val);
                if (node.left != null) {
                    q.add(node.left);
                }
                if (node.right != null) {
                    q.add(node.right);
                }
            }
            result.add(list);
        }

        return result;

    }

    // public static void main(String[] args) {

    // String[] str = { "flower", "flow", "flight" };
    // System.out.println(longestCommonPrefix(str));

    // // String[] str2 = {"dog", "racecar", "car"};
    // // System.out.println(longestCommonPrefix(str2))
    // int height[] = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
    // System.out.println(maxArea(height));
    // }

    public ListNode copyRandomList(ListNode head) {
        if (head == null)
            return head;
        ListNode node = new ListNode(0);
        ListNode new_curr = node;
        ListNode curr = head;
        HashMap<ListNode, ListNode> map = new HashMap<>();

        while (curr != null) {
            ListNode temp = new ListNode(curr.val);
            map.put(curr, temp);

            new_curr.next = temp;
            new_curr = new_curr.next;
            curr = curr.next;
        }

        curr = head;
        new_curr = node.next;

        while (curr != null) {
            ListNode r = curr.random;
            ListNode newNode = r != null ? map.get(r) : null;

            new_curr.random = newNode;

            new_curr = new_curr.next;
            curr = curr.next;
        }
        return node.next;
    }

    public ListNode insertionSort(ListNode head) {
        ListNode temp = new ListNode(-1);
        ListNode curr = head;

        while (curr != null) {
            ListNode prev = temp;

            while (prev.next != null && prev.next.val <= curr.val) {
                prev = prev.next;
            }

            ListNode nxt = curr.next;

            curr.next = prev.next;
            prev.next = curr;

            curr = nxt;
        }

        return temp.next;
    }
}
