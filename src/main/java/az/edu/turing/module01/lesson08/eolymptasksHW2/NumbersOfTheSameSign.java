package az.edu.turing.module01.lesson08.eolymptasksHW2;

import java.util.Scanner;

public class NumbersOfTheSameSign {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        scanner.close();
        int result = (n > 0 && m > 0) || (n < 0 && m < 0) ? 1 : 0;
        System.out.println(result);
    }
}

