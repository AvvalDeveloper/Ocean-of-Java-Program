package Program.ArithmaticOperations;

import java.util.Scanner;

public class DivideNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number you want to divide from: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the number you want to divide: ");
        int num2 = scanner.nextInt();

        System.out.println("Division of " + num1 + " by " + num2 + " is: " + (num1/num2));
    }
}
