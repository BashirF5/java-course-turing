package az.edu.turing.module01.lesson08.eolymptasksHW2;

import java.util.Scanner;

public class SignFunction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        scanner.close();
        int sign = Integer.compare(x, 0);

        System.out.println(sign);
    }
}

