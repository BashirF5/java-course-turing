package az.edu.turing.module01.lesson08.eolymptasksHW2;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        String parity = (n % 2 == 0) ? "EVEN" : "ODD";
        System.out.println(parity);
    }
}
