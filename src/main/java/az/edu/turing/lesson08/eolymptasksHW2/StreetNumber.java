package az.edu.turing.lesson08.eolymptasksHW2;

import java.util.Scanner;

public class StreetNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        scanner.close();
        int result = (n % 2 == m % 2) ? 1 : 0;
        System.out.println(result);
    }
}
