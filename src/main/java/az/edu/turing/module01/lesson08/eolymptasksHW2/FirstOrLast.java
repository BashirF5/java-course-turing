package az.edu.turing.module01.lesson08.eolymptasksHW2;

import java.util.Scanner;

public class FirstOrLast {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int threeDigitNumber = scanner.nextInt();
        scanner.close();
        int firstDigit = threeDigitNumber / 100;
        int lastTwoDigits = threeDigitNumber % 100;
        int lastDigit = lastTwoDigits % 10;
        String result;
        if (firstDigit > lastDigit) {
            System.out.println(firstDigit);
        } else if (lastDigit > firstDigit) {
            System.out.println(lastDigit);
        } else {
            System.out.println("They are equal");
        }
    }
}

