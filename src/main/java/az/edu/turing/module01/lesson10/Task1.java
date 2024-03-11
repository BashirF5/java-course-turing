package az.edu.turing.module01.lesson10;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        int c = scanner.nextInt();
        doubleMethod(a);
        intMethod(c);
    }


    public static double doubleMethod(double d) {
        return d + 2;
    }

    public static int intMethod(int c) {
        return c + 2;
    }

}