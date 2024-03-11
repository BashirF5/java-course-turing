package az.edu.turing.module01.lesson08.eolymptasksHW2;

import java.util.Scanner;

public class Divisibility {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        scanner.close();
        if (a % b == 0) {
            System.out.println("Divisible");
        } else {
            int quotient = a / b;
            int remainder = a % b;
            System.out.println(quotient + " " + remainder);
        }
    }
}

