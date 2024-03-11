package az.edu.turing.module01.lesson08.eolymptasksHW2;

import java.util.Scanner;

public class PreviousOddInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        int previousOdd;

        if (n % 2 == 0) {
            previousOdd = n - 1;
        } else {
            previousOdd = n - 2;
        }
        System.out.println(previousOdd);
    }
}

