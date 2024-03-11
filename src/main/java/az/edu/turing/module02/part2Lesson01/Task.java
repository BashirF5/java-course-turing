package az.edu.turing.module02.part2Lesson01;

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String something1 = scanner.nextLine();
        System.out.println();
        String something2 = scanner.nextLine();

        int n1 = Integer.parseInt(something1);
        int n2 = Integer.parseInt(something2);

        System.out.println(n1 / n2);

    }
}
