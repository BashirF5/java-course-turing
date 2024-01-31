package az.edu.turing.lesson10;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextInt();
        int c = scanner.nextInt();
        doubleMethod(double a);
        intMethod(int c);
    }
}

public static double doubleMethod(double d){
    return d + 2;
}

public static int intMethod(int c){
    return c + 2;
}