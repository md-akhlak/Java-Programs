package ARRAYS;

public class LinearSearch {

    public static int linearSearch(int num[], int key) {
        for (int i = 0; i < num.length; i++) {
            if (key == num[i]) {
                System.out.println("index at : " + i);
                return num[i];
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        int num[] = { 1, 2, 22, 44, 90, 6, 7, 9 };

        int key = 1;

        int index = linearSearch(num, key);
        if (index == -1) {
            System.out.println("Key not found : " + key);
        } else {
            System.out.println("Key found : " + index);
        }
    }
}
