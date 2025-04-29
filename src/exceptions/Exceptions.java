package exceptions;

import java.util.Scanner;

public class Exceptions {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numberOne;
        int numberTwo;
        System.out.println("Enter the first number");
        numberOne = input.nextInt();
        System.out.println("Enter the second number");
        numberTwo = input.nextInt();
        try {
            int divisor = numberOne / numberTwo;
            System.out.println("Divisor is " + divisor);
        }
        catch (ArithmeticException e) {
            System.out.println("Arithmetic exception, divisor cannot be 0: " + e.getMessage());
        }
        input.close();
    }
}
