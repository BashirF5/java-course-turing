package az.edu.turing.module01.lesson08.eolymptasksHW2;

import java.util.Scanner;

public class FunctionY2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long x = scanner.nextInt();
        scanner.close();
        long y;
        if (x >= 10) {
            y = x * x * x + 5 * x;
        } else {
            y = x * x - 2 * x + 4;
        }
        System.out.println(y);
    }
}

