package az.edu.turing.module01.lesson08.eolymptasksHW2;

import java.util.Scanner;

public class OneOutOfTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        if (n % 2 != 0 || (n > 0 && n >= 100 && n <= 999)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
