package az.edu.turing.module01.lesson08.eolymptasksHW2;

import java.util.Scanner;

public class WaterAndIce {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.close();
        if (t > 0) {
            System.out.println("Water");
        } else {
            System.out.println("Ice");
        }
    }
}

