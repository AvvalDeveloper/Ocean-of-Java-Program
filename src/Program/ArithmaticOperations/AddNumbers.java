package Program.ArithmaticOperations;

import java.util.Scanner;

public class AddNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        System.out.println("How many numbers do you want to add?");

        int index = scanner.nextInt();

        for (int i = 0; i < index; i++) {

            System.out.print("Enter Number " + (i+1) + ": ");

            int temp = scanner.nextInt();

            sum = sum + temp;

        }

        System.out.println("Addition of all these " + index + " numbers is: " + sum);
    }
}
