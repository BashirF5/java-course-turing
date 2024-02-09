package az.edu.turing.lesson12.eolymptasksHW4;

import java.util.Scanner;

public class PerfectSquare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double m = Math.sqrt(n);
        if (n == (int) m*m){
            System.out.printf("%.0f", m);
        } else{
            System.out.println("No");
        }
    }
}
