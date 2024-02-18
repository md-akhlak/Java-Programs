package heap;

import java.util.ArrayList;

public class Heap {

    ArrayList<Integer> arr = new ArrayList<Integer>();

    public void add(int data) {
        arr.add(data);

        int size = arr.size() - 1;

        int parent = (size - 1) / 2;

        while (arr.get(size) < arr.get(parent)) {
            // swap
            int temp = arr.get(size);
            arr.set(size, arr.get(parent));
            arr.set(parent, temp);

            size = parent;
            parent = (size - 1) / 2;
        }

    }

    public int peek() {
        return arr.get(0);
    }

    public void heapifyMin(int i) {
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        int min = i;

        if (left < arr.size() && arr.get(min) > arr.get(left)) {
            min = left;
        }
        if (right < arr.size() && arr.get(min) > arr.get(right)) {
            min = right;
        }

        if (min != i) {
            // swap
            int temp = arr.get(i);
            arr.set(i, arr.get(min));
            arr.set(min, temp);

            heapifyMin(min);
        }

    }

    public void heapifyMax(int i) {
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        int min = i;

        if (left < arr.size() && arr.get(min) < arr.get(left)) {
            min = left;
        }
        if (right < arr.size() && arr.get(min) < arr.get(right)) {
            min = right;
        }

        if (min != i) {
            // swap
            int temp = arr.get(i);
            arr.set(i, arr.get(min));
            arr.set(min, temp);

            heapifyMax(min);
        }

    }

    public int remove() {
        // get 1st index
        int data = arr.get(0);
        int last = arr.size() - 1;

        // swap
        int temp = arr.get(0);
        arr.set(0, arr.get(arr.size() - 1));
        arr.set(arr.size() - 1, temp);

        // remove
        arr.remove(last);

        // call heapify
        heapifyMin(0);
        return data;
    }

    public boolean isEmpty() {
        return arr.size() == 0;
    }

    public static void heapify(int arr[], int i, int size) {
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        int maxIdx = i;

        if (left < size && arr[left] > arr[maxIdx]) {
            maxIdx = left;
        }
        if (right < size && arr[right] > arr[maxIdx]) {
            maxIdx = right;
        }

        while (maxIdx != i) {
            int temp = arr[i];
            arr[i] = arr[maxIdx];
            arr[maxIdx] = temp;

            heapify(arr, maxIdx, size);
        }
    }

    public static void heapSort(int arr[]) {
        int n = arr.length;
        for (int i = n / 2; i >= 0; i--) {
            heapify(arr, i, n);
        }

        for (int i = n - 1; i > 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heapify(arr, 0, i);
        }
    }

    public static void display(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // public static void insert(int H[], int n) {
    // int i = n;
    // int temp = H[i];

    // while (i > 1 && temp > H[i / 2]) {
    // H[i] = H[i / 2];
    // i = i / 2;
    // }

    // H[i] = temp;

    // }

    // public static void delete(int H[], int n) {
    // int value = H[1];
    // int x = H[n];

    // H[1] = H[n];

    // H[n] = value;

    // int i = 1;
    // int j = i * 2;

    // while (j < n - 1) {
    // if (H[j + 1] > H[j]) {
    // j = j + 1;
    // }
    // if (H[i] < H[j]) {
    // int temp = H[i];
    // H[i] = H[j];
    // H[j] = temp;
    // i = j;
    // j = 2 * j;
    // } else {
    // break;
    // }
    // }

    // // return value;

    // }

    // public static int heapSort(int H[], int n) {
    // int value = H[1];
    // int x = H[n];

    // H[1] = H[n];

    // H[n] = value;

    // int i = 1;
    // int j = i * 2;

    // while (j < n - 1) {
    // if (H[j + 1] > H[j]) {
    // j = j + 1;
    // }
    // if (H[i] < H[j]) {
    // int temp = H[i];
    // H[i] = H[j];
    // H[j] = temp;
    // i = j;
    // j = 2 * j;
    // } else {
    // break;
    // }
    // }

    // return value;

    // }

    // public static void printHeap(int H[]) {
    // for (int i = 1; i < H.length; i++) {
    // System.out.print(H[i] + " ");
    // }
    // System.out.println();
    // }

    public static void main(String[] args) {

        // Heap heap = new Heap();
        // heap.add(9);
        // heap.add(2);
        // heap.add(5);
        // heap.add(6);
        // heap.add(3);

        // while (!heap.isEmpty()) {
        // System.out.print(heap.peek() + " ");
        // heap.remove();
        // }

        int arr[] = { 5, 7, 2, 9, 1, 4, 3 };
        display(arr);
        heapSort(arr);
        display(arr);

    }

}
