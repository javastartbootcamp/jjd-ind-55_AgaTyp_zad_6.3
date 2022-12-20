package pl.javastart.task;

public class MatrixUtils {

    void printMatrix(int[][] matrix) {
        String dash = "-".repeat(6);

        for (int[] row : matrix) {
            for (int col : row){
                System.out.printf("%5d|",col);;
            }
            System.out.printf("\n%s\n", dash.repeat(matrix[0].length));
        }

    }

    void fillMatrix(int[][] matrix) {

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = i * j;
            }
        }
    }
}
