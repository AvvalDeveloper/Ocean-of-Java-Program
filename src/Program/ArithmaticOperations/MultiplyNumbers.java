package Program.ArithmaticOperations;

import java.util.Scanner;

public class MultiplyNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int total = 1;

        System.out.println("How many numbers do you want to multiply?");
        int index = scanner.nextInt();

        for (int i = 0; i < index; i++) {

            System.out.print("Enter number " + (i+1) + ": ");
            int temp = scanner.nextInt();

            total = total*temp;
        }

        System.out.println("Multiplication of all these " + index + " number is: " + total);
    }
}
