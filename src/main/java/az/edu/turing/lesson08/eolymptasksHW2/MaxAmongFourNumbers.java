package az.edu.turing.lesson08.eolymptasksHW2;
import java.util.Scanner;

public class MaxAmongFourNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        scanner.close();
        int max = Math.max(Math.max(a, b), Math.max(c, d));
        System.out.println(max);
    }
}
