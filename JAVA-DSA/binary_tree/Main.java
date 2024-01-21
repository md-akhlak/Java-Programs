package binary_tree;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BinaryTree obj = new BinaryTree();

        Scanner sc = new Scanner(System.in);

        obj.insert(sc);
        obj.displayBest();


        int arr[] = {8,3,6,2,1,4,8,9,12};
        BST tree = new BST();
        tree.display();


    }
}
