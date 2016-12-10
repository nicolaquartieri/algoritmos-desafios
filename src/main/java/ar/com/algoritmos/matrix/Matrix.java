package ar.com.algoritmos.matrix;

public class Matrix {

    public static int[][] getSubMatrix(int[][] matrix, int i, int j) {
        int[][] subMatrix = new int[matrix.length - i][matrix[1].length - j];
        int subI = 0;
        int subJ = 0;

        int rowLength = matrix.length;
        for (int row = i ; row < rowLength ; row++) {
            int columnLength = matrix[row].length;
            for (int column = j ; column < columnLength ; column++) {
                subMatrix[subI][subJ] = matrix[row][column];
                subJ++;
            }
            subI++;
            subJ = 0;
        }

        return subMatrix;
    }
}
