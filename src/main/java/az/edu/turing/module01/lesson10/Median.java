package az.edu.turing.module01.lesson10;

import java.util.Scanner;

public class Median {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[3];
        for (int i = 0; i < 3; i++) {
            numbers[i] = scanner.nextInt();
        }
        findMedian(numbers);
        System.out.println(numbers[1]);
    }
    private static void findMedian(int[] numbers) {
        if (numbers[0] > numbers[1]) {
            int temp = numbers[0];
            numbers[0] = numbers[1];
            numbers[1] = temp;
        }

        if (numbers[1] > numbers[2]) {
            int temp = numbers[1];
            numbers[1] = numbers[2];
            numbers[2] = temp;
        }

        if (numbers[0] > numbers[1]) {
            int temp = numbers[0];
            numbers[0] = numbers[1];
            numbers[1] = temp;
        }
    }
}

