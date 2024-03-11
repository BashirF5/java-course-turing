package az.edu.turing.module01.lesson08;

import java.util.Scanner;

public class DoubleArrayExercise {
    public static void main(String[] args) {
        System.out.println("Enter the dimension of the matrix");
        Scanner scanner = new Scanner(System.in);
        int dimension = scanner.nextInt();
        int[][] matrice = new int[dimension][dimension];
        System.out.printf("%d", matrice);

    }
}
