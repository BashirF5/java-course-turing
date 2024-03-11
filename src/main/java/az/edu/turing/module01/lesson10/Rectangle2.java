package az.edu.turing.module01.lesson10;

import java.util.Scanner;

public class Rectangle2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        printRectangle(n, m);
    }
    private static void printRectangle(int n, int m) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }
}

