package binarysearch;

public class binarysearch {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int target = 4;

        boolean result = binarySearch(array, target);
        System.out.println("Expected Output: " + result);
    }

    public static boolean binarySearch(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (array[mid] == target) {
                return true;
            }

            if (array[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return false;
    }
}