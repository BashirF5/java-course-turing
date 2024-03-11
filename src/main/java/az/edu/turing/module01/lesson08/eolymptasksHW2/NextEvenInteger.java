package az.edu.turing.module01.lesson08.eolymptasksHW2;

import java.util.Scanner;

public class NextEvenInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        int nextEven;
        if (n % 2 == 0) {
            nextEven = n + 2;
        } else {
            nextEven = n + 1;
        }
        System.out.println(nextEven);
    }
}

