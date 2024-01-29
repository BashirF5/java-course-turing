package az.edu.turing.lesson08.eolymptasksHW2;

import java.util.Scanner;

public class OutsideInterval {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        scanner.close();
        if (x < a || x > b) {
            System.out.println("OUT");
        } else {
            System.out.println("IN");
        }
    }
}

