package az.edu.turing.lesson08.eolymptasksHW2;

import java.util.Scanner;

public class NoneOfTheConditions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        if (!(n % 2 == 0 && n > 0) && !(n % 2 != 0 && n < 0)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}

