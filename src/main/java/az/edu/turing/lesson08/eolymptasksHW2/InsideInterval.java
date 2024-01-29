package az.edu.turing.lesson08.eolymptasksHW2;

import java.util.Scanner;

public class InsideInterval {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        scanner.close();
        if (a <= x && x <= b) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
