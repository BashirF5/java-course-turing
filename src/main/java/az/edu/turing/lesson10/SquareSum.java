package az.edu.turing.lesson10;

import java.util.Scanner;

public class SquareSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int digitSum = calculateDigitSum(n);
        int squareOfDigitSum = digitSum * digitSum;

        System.out.println(squareOfDigitSum);
    }
    private static int calculateDigitSum(int number) {
        int tensDigit = number / 10;
        int unitsDigit = number % 10;
        return tensDigit + unitsDigit;
    }
}

