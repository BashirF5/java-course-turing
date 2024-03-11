package az.edu.turing.module01.lesson12.eolymptasksHW4;

import java.util.Scanner;

public class VariableOf6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        double y = ((Math.sqrt(Math.pow(x, 4) + 1))/ (Math.pow(x, 2) ) - (Math.sqrt((Math.pow(x, 2) / (Math.pow(x, 2)+1)))));
        System.out.printf("%.3f", y);
    }
}
