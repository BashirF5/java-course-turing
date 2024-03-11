package az.edu.turing.module01.lesson10;

import java.util.Scanner;

public class MinMaxExpressions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();
        double z = scanner.nextDouble();
        double result = calculateMinMaxExpression(x, y, z);
        System.out.printf("%.2f\n", result);
    }

    private static double calculateMinMaxExpression(double x, double y, double z) {
        double max1 = max(x, y);
        double max2 = max(y, z);
        double sum = x + y + z;

        return min(max1, max2, sum);
    }
    private static double min(double a, double b) {
        return Math.min(a, b);
    }
    private static double min(double a, double b, double c) {
        return min(min(a, b), c);
    }
    private static double max(double a, double b) {
        return Math.max(a, b);
    }
}

