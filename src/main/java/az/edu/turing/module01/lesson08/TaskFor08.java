package az.edu.turing.module01.lesson08;

import java.util.Scanner;

public class TaskFor08 {
    public static void main(String[] args) {
        System.out.println("Enter the number that you want to find the divisors of");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if (a>10){
            int[] array = new int[10];
        }
        if (a>1000){
            int[] array = new int[1000];
        }
    }
}

//Not Efficient, if there is 11th element, we will have unwanted empty space
