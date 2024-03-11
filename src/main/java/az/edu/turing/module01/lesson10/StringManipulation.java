package az.edu.turing.module01.lesson10;

import java.util.Scanner;

public class StringManipulation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();
        System.out.println(sentence.toLowerCase());
        System.out.println(sentence.toUpperCase());
        System.out.println(sentence.trim());
        System.out.println(sentence.substring(5));
        System.out.println(sentence.indexOf(sentence));
    }
}
