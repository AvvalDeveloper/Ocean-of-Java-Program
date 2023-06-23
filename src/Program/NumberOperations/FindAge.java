package Program.NumberOperations;

import java.util.Scanner;

public class FindAge {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int age;

        System.out.print("Enter your Date of Birth (DD MM YYYY): ");
        int birthDate = scanner.nextInt();
        int birthMonth = scanner.nextInt();
        int birthYear = scanner.nextInt();

        System.out.print("Enter today's date (DD MM YYYY): ");
        int currentDate = scanner.nextInt();
        int currentMonth = scanner.nextInt();
        int currentYear = scanner.nextInt();

        if (currentMonth >= birthMonth && currentDate >= birthDate) {

            age = currentYear - birthYear;

        } else {

            age = currentYear - birthYear - 1;

        }

        System.out.println("Your are " + age + " years old.");
    }
}
