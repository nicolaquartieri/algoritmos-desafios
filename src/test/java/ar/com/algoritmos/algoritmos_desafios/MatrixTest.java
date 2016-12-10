package ar.com.algoritmos.algoritmos_desafios;

import ar.com.algoritmos.matrix.Matrix;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;


public class MatrixTest {

    @Test
    public void mergeTest() {
        // Arrange
        int[][] expected = {{91, 61, 32},
                            {36, 93, 56}};
        int[][] matrix = {{21, 1, 31, 51},
                          {41, 91, 61, 32},
                          {43, 36, 93, 56}}; // 3x4 matrix.
        int[][] result;

        // Act
        result = Matrix.getSubMatrix(matrix, 1, 1);

        // Assert
        assertArrayEquals(expected, result);
    }
}
