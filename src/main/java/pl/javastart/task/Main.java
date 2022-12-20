package pl.javastart.task;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int rowNo;
        int colNo;

        do {
            System.out.println("Podaj liczbę wierszy.");
        } while (!((rowNo = scanner.nextInt()) < 100) || rowNo < 0);

        do {
            System.out.println("Podaj liczbę kolumn.");
        } while (!((colNo = scanner.nextInt()) < 100) || colNo < 0);

        int[][] matrix = new int[rowNo][colNo];
        MatrixUtils utils = new MatrixUtils();

        utils.fillMatrix(matrix);
        utils.printMatrix(matrix);

    }
}
