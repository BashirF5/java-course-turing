package az.edu.turing.module01.lesson08.eolymptasksHW2;

import java.util.Scanner;

public class DivisibilityByDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int fourDigitNumber = scanner.nextInt();
        scanner.close();
        int thousands = fourDigitNumber / 1000;
        int hundreds = (fourDigitNumber / 100) % 10;
        int tens = (fourDigitNumber / 10) % 10;
        int units = fourDigitNumber % 10;
        boolean divisible = (thousands != 0 && fourDigitNumber % thousands == 0) &&
                (hundreds != 0 && fourDigitNumber % hundreds == 0) &&
                (tens != 0 && fourDigitNumber % tens == 0) &&
                (units != 0 && fourDigitNumber % units == 0);
        if (divisible) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}

