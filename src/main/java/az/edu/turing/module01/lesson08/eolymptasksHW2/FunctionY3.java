package az.edu.turing.module01.lesson08.eolymptasksHW2;

import java.util.Scanner;

public class FunctionY3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        scanner.close();
        int y;
        if (x < -4) {
            y = x + 5;
        } else if (-4 <= x && x <= 7) {
            y = x * x - 3 * x;
        } else {
            y = x * x * x + 2 * x;
        }
        System.out.println(y);
    }
}
