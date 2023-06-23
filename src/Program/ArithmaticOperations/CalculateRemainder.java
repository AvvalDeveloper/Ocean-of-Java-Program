package Program.ArithmaticOperations;

import java.util.Scanner;

public class CalculateRemainder {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Dividend: ");
        int dividend = scanner.nextInt();

        System.out.print("Enter Divisor: ");
        int divisor = scanner.nextInt();

        System.out.println("Remainder = " + dividend%divisor);

    }
}
