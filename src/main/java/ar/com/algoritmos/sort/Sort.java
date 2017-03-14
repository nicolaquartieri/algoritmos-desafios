package ar.com.algoritmos.sort;

/**
 * Quick Sort Algorithm.
 * 1. Choose a Pivot.
 * 2. Reorder de array so all the element with values less than the pivot come before the pivot and than the pivot after
 * this one. (with the same values stay in the same place)
 * 3. Apply the same steps for the sub-arrays of elements.
 *
 * How many steps ? (if n es number of elements)
 * Best: O(1)
 * Average: O(n * log n)
 * Worst: O(n^2)
 *
 * Merge Sort Algorithm.
 * 1. Divide the unsorted list into n sublists, each containing 1 element (a list of 1 element is considered sorted).
 * 2. Repeatedly merge sublists to produce new sorted sublists until there is only 1 sublist remaining.
 * This will be the sorted list.
 *
 * How many steps ? (if n es number of elements)
 * Best: O(n * log n)
 * Average: O(n * log n)
 * Worst: O(n * log n)
 */
public class Sort {

    /**
     * Swap elements between postitions.
     * @param vector The array.
     * @param pos1 The position 1.
     * @param pos2 The position 2.
     */
    private static void swap(int[] vector, int pos1, int pos2) {
        int temp = vector[pos1];
        vector[pos1] = vector[pos2];
        vector[pos2] = temp;
    }

    // Bubble Sort.
    public static void bubbleSort(int[] vector) {
        int currentIndex = vector.length;

        int outer, innner;
        for (outer = currentIndex - 1; outer > 0; outer--) // outer loop (in backward direction)
            for (innner = 0; innner < outer; innner++) // inner loop (in forward direction)
                if (vector[innner] > vector[innner + 1]) // out of order?
                    swap(vector, innner, innner + 1); // swap them
    }
    // Bubble Sort.

    // Insertion Sort.
    public static void insertionSort(int[] vector) {
        int currentIndex = vector.length;

        int inner, outer, tempValue;
        for (outer = 1; outer < currentIndex; outer++){ // outer is dividing line

            tempValue = vector[outer]; // remove marked element
            inner = outer; // start shifts at outer
            while (inner > 0 && vector[inner - 1] >= tempValue){ // until one is smaller,
                vector[inner] = vector[inner - 1]; // shift elements to right
                --inner; // go one position left
            }

            vector[inner] = tempValue; // insert marked element at inner position
        }
    }
    // Insertion Sort.

    // Merge Sort.
    public static void mergeSort(int[] vector) {
        int[] ar2 = new int[vector.length];
        merge(vector, ar2, 0, vector.length - 1);
    }

    private static void merge(int[] vector, int[] workSpace, int lowerBound, int upperBound) {
        if (lowerBound == upperBound) {
            return;    // no need to sort further.
        } else {    // finding mid point
            int midPoint = (lowerBound + upperBound) / 2;
            merge(vector, workSpace, lowerBound, midPoint); // sorting low half
            merge(vector, workSpace, midPoint + 1, upperBound); // sort upper half
            merging(vector, workSpace, lowerBound, midPoint + 1, upperBound);//merging them
        }
    }

    private static void merging(int[] vector, int[] ar2, int low, int high, int upperBound) {
        int midPoint = high - 1;
        int lowerBound = low;
        int n = upperBound - lowerBound + 1;
        int i = 0;

        while (low <= midPoint && high <= upperBound)
            if (vector[low] < vector[high])
                ar2[i++] = vector[low++];
            else
                ar2[i++] = vector[high++];

        while (low <= midPoint)
            ar2[i++] = vector[low++];

        while (high <= upperBound)
            ar2[i++] = vector[high++];

        for (i = 0; i < n; i++)
            vector[lowerBound + i] = ar2[i];
    }
    // Merge Sort.

    // Quick Sort.
    public static void quickSort(int[] vector) {
        quick(vector, 0, vector.length - 1);
    }

    private static void quick(int[] vector, int left, int right) {
        if (right - left <= 0) // size <= 1,
            return; // means array is already sorted.
        else{
            int pivot = vector[right]; // rightmost item
            int partition = partitionArray(vector, pivot, left, right); //find out partition range.
            quick(vector, left, partition - 1);   // sort the left side.
            quick(vector, partition + 1, right); // sort the right side.
        }
    }

    //partition of array in java
    private static int partitionArray(int[] vector, int pivot, int left, int right) {
        int leftIndicator = left - 1;
        int rightIndicator = right;
        while (true) {
            // find bigger element.
            while(vector[++leftIndicator] < pivot);          //execute while loop till -> elements are smaller than pivot, as soon as bigger element is found we stop while loop.

            // find smaller element.
            while(rightIndicator>0 && vector[--rightIndicator]>pivot);//execute while loop till -> elements are greater than pivot, as soon as smaller element is found we stop while loop.

            if (leftIndicator >= rightIndicator) // if pointers have crossed, partition have been done, break.
                break;
            else
                swap(vector, leftIndicator, rightIndicator); //If we haven't crossed swap the elements.
        }

        swap(vector, leftIndicator, right); // restoring the pivot.
        return leftIndicator; //return restored pivot location.
    }
    // Quick Sort.
}
