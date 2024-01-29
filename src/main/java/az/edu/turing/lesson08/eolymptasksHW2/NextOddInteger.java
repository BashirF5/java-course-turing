package az.edu.turing.lesson08.eolymptasksHW2;

import java.util.Scanner;

public class NextOddInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        int nextOdd;
        if (n % 2 == 0) {
            nextOdd = n + 1;
        } else {
            nextOdd = n + 2;
        }
        System.out.println(nextOdd);
    }
}

