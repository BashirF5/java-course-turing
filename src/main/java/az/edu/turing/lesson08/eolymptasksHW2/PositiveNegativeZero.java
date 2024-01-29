package az.edu.turing.lesson08.eolymptasksHW2;

import java.util.Scanner;

public class PositiveNegativeZero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        String result;
        if (n > 0) {
            result = "Positive";
        } else if (n < 0) {
            result = "Negative";
        } else {
            result = "Zero";
        }
        System.out.println(result);
    }
}
