package az.edu.turing.module01.lesson08.eolymptasksHW2;

import java.util.Scanner;

public class SimpleProblem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int twoDigitNumber = scanner.nextInt();
        scanner.close();
        if (twoDigitNumber >= 10 && twoDigitNumber <= 99) {
            int tensDigit = twoDigitNumber / 10;
            int unitsDigit = twoDigitNumber % 10;
            System.out.println(" " + tensDigit + " " + unitsDigit);
        } else {
            System.out.println("Invalid input. Please enter a two-digit number.");
        }
    }
}
