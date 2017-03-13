package ar.com.algoritmos.search;

public class BinarySearch {

    // Iterative method.
    public static int binarySearch(int[] vector, int key) {
        Integer index = vector.length;
        int low = 0;  //points to first occupied cell in array.
        int up = index - 1; //points to last occupied cell in array.
        int mid = 0;  //points to mid of array.

        while (true) {
            mid = (low + up) / 2;

            if (low > up) {
                System.out.print("\nElement=" + key + " not found");
                return index;
            } else if (vector[mid] == key) {
                System.out.print("\nElement=" + key + " found at position="   + mid);
                return mid;
            } else if (vector[mid] > key) {
                up = mid - 1;
            } else {
                low = mid + 1;
            }
        }
    }

    // Recursive methods:
    public static int binarySearchRecursive(int[] a, int target) {
        return binarySearch(a, 0, a.length - 1, target);
    }

    private static int binarySearch(int[] a, int start, int end, int target) {
        int middle = (start + end) / 2;
        if (end < start) {
            return -1;
        }

        if (target == a[middle]) {
            return middle;
        } else if (target < a[middle]) {
            return binarySearch(a, start, middle - 1, target);
        } else {
            return binarySearch(a, middle + 1, end, target);
        }
    }
}
