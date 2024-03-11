package az.edu.turing.module01.lesson08.eolymptasksHW2;

import java.util.Scanner;

public class EducationalAchievement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int grade = scanner.nextInt();
        scanner.close();
        String achievementLevel;
        if (grade >= 1 && grade <= 3) {
            achievementLevel = "Initial";
        } else if (grade >= 4 && grade <= 6) {
            achievementLevel = "Average";
        } else if (grade >= 7 && grade <= 9) {
            achievementLevel = "Sufficient";
        } else if (grade >= 10 && grade <= 12) {
            achievementLevel = "High";
        } else {
            System.out.println("Invalid input. Please enter a grade between 1 and 12.");
            return;
        }
        System.out.printf("%s",achievementLevel);
    }
}

