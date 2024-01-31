package az.edu.turing.lesson10;

import java.util.Scanner;

public class MatrixExercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        printNumberMatrix(n, m);
    }

    private static void printNumberMatrix(int n, int m) {
        int[][] matrix = new int[n][m];
        int currentNumber = 1;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = currentNumber++;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}

