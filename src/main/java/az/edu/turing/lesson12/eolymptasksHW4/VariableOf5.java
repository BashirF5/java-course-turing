package az.edu.turing.lesson12.eolymptasksHW4;

import java.util.Scanner;

public class VariableOf5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        double y = ((2 * x )/ (Math.sqrt(Math.pow(x, 2) + 1)) - (Math.sqrt((Math.pow(x, 2) + 1)) / (Math.pow(x, 3))));
        System.out.printf("%.3f", y);
    }
}
