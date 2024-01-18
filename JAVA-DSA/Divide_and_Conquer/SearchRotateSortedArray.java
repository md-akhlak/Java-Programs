package Divide_and_Conquer;

public class SearchRotateSortedArray {

    public static int searchArray(int arr[], int start, int end, int key) {

        int mid = start + (end - start) / 2;

        if (start > mid) {
            return -1;
        }

        if (start <= end) {

            if (key == arr[mid]) {
                return mid;
            }

            if (arr[start] <= arr[mid]) {

                if (arr[start] <= key && key <= arr[mid]) {
                    return searchArray(arr, start, mid - 1, key);
                } else {
                    return searchArray(arr, mid + 1, end, key);
                }
            } else {

                if (arr[mid] <= key && key <= arr[end]) {
                    return searchArray(arr, mid + 1, end, key);
                } else {
                    return searchArray(arr, start, mid - 1, key);
                }
            }
        }
        return -1;

    }

    public static boolean search(int[] arr, int key) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == key) {
                return true;
            }

            while (start < mid && arr[start] == arr[mid]) {
                start++;
            }

            if (arr[start] <= arr[mid]) {
                if (arr[start] <= key && key < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (arr[mid] < key && key <= arr[end]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }

        return false;

    }

    public static int searchArr(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target == nums[mid]) {
                return mid;
            }

            while (start < mid && nums[start] == nums[mid]) {
                start++;
            }

            if (nums[start] <= nums[mid]) {

                if (nums[start] <= target && target < nums[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (nums[mid] < target && target <= nums[end]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }

        }

        return -1;

    }

    public static void main(String[] args) {
        int arr[] = {1, 1, 1, 0, 1};
//
        int target = searchArray(arr, 0, arr.length - 1, 99);
        System.out.println(target);

        System.out.println(searchArray(arr, 0, arr.length - 1, 4));


        boolean x = search(arr, 0);
        System.out.println(x);

        int val = searchArr(arr, 0);
        System.out.println(val);


    }
}
