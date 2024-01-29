package az.edu.turing.lesson08.eolymptasksHW2;

import java.util.Scanner;

public class ProductOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int threeDigitNumber = scanner.nextInt();
        scanner.close();
        int firstDigit = threeDigitNumber / 100;
        int lastTwoDigits = threeDigitNumber % 100;
        int secondDigit = lastTwoDigits / 10;
        int thirdDigit = lastTwoDigits % 10;
        int productOfDigits = firstDigit * secondDigit * thirdDigit;
        System.out.println(productOfDigits);
    }
}
