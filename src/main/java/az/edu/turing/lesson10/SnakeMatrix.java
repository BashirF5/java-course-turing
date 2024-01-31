package az.edu.turing.lesson10;

import java.util.Scanner;

public class SnakeMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] matrix = new int[n][n];
        fillSnakeMatrix(matrix);
        printMatrix(matrix);
    }
    private static void fillSnakeMatrix(int[][] matrix) {
        int value = 1;
        for (int i = 0; i < matrix.length; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < matrix[i].length; j++) {
                    matrix[i][j] = value++;
                }
            }
            else {
                for (int j = matrix[i].length - 1; j >= 0; j--) {
                    matrix[i][j] = value++;
                }
            }
        }
    }
    private static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]+ " ");
            }
            System.out.println();
        }
    }
}

