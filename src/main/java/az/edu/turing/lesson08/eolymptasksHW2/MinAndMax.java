package az.edu.turing.lesson08.eolymptasksHW2;

import java.util.Scanner;

public class MinAndMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        scanner.close();
        int min = Math.min(a, b);
        int max = Math.max(a, b);
        System.out.println(min + " " + max);
    }
}
