package az.edu.turing.module01.lesson07;

import java.util.Scanner;

public class Lesson07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of the array:");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the numbers");
        for (int i=0;i<n;i++) {
            arr[i] = scanner.nextInt();
        }
        for (int element:arr){
            System.out.println(2*element);
        }
        }
    }

