package az.edu.turing.lesson08.eolymptasksHW2;

import java.util.Scanner;

public class SeasonOfTheYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int monthNumber = scanner.nextInt();
        scanner.close();
        String season;
        if (monthNumber >= 1 && monthNumber <= 12) {
            if (monthNumber >= 3 && monthNumber <= 5) {
                season = "Spring";
            } else if (monthNumber >= 6 && monthNumber <= 8) {
                season = "Summer";
            } else if (monthNumber >= 9 && monthNumber <= 11) {
                season = "Autumn";
            } else {
                season = "Winter";
            }
            System.out.println(season);
        } else {
            System.out.println("Invalid input. Please enter a month number between 1 and 12.");
        }
    }
}
