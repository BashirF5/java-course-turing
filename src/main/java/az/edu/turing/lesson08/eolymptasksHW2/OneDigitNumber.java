package az.edu.turing.lesson08.eolymptasksHW2;

import java.util.Scanner;

public class OneDigitNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        String result = (n >= 0 && n < 10) || (n < 0 && n > -10) ? "Ok" : "No";
        System.out.println(result);
    }
}

