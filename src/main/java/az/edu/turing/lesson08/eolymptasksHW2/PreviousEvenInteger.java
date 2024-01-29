package az.edu.turing.lesson08.eolymptasksHW2;

import java.util.Scanner;

public class PreviousEvenInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        int previousEven;

        if (n % 2 == 0) {
            previousEven = n - 2;
        } else {
            previousEven = n - 1;
        }
        System.out.println(previousEven);
    }
}

