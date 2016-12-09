package ar.com.algoritmos.algoritmos_desafios;

import ar.com.algoritmos.sort.Sort;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SortTest {

    private int[] expected;

    @Before
    public void setup() {
        expected = new int[]{1, 21, 31, 32, 36, 41, 51, 61, 91, 93};
    }

    @Test
    public void bubbleTest() {
        // Arrange
        int[] vector = {21, 1, 31, 51, 41, 91, 61, 32, 36, 93};

        // Act
        Sort.bubbleSort(vector);

        // Assert
        assertArrayEquals(expected, vector);
    }

    @Test
    public void insertionTest() {
        // Arrange
        int[] vector = {21, 1, 31, 51, 41, 91, 61, 32, 36, 93};

        // Act
        Sort.insertionSort(vector);

        // Assert
        assertArrayEquals(expected, vector);
    }

    @Test
    public void mergeTest() {
        // Arrange
        int[] vector = {21, 1, 31, 51, 41, 91, 61, 32, 36, 93};

        // Act
        Sort.mergeSort(vector);

        // Assert
        assertArrayEquals(expected, vector);
    }

    @Test
    public void quickTest() {
        // Arrange
        int[] vector = {21, 1, 31, 51, 41, 91, 61, 32, 36, 93};

        // Act
        Sort.quickSort(vector);

        // Assert
        assertArrayEquals(expected, vector);
    }
}
