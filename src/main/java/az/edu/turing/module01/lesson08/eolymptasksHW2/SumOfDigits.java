package az.edu.turing.module01.lesson08.eolymptasksHW2;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int fourDigitNumber = scanner.nextInt();
        scanner.close();
        int firstDigit = fourDigitNumber / 1000;
        int lastThreeDigits = fourDigitNumber % 1000;
        int lastDigit = lastThreeDigits % 10;
        int sumOfDigits = firstDigit + lastDigit;
        System.out.println(sumOfDigits);
    }
}
