package Program.ArithmaticOperations;

import java.util.Scanner;

public class SubtractNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number you want to subtract from: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the number you want to subtract: ");
        int num2 = scanner.nextInt();

        System.out.println("Subtraction of " + num2 + " from " + num1 + " is: " + (num1-num2));
    }
}
