package TechModule.MethodsAndFunctions;

import java.util.Scanner;

public class SignOfInteger {

    public static void positiveNumber(int n) {

        System.out.printf("The number %d is positive.", n);
    }
    public static void negativeNumber(int n) {

        System.out.printf("The number %d is negative.", n);
    }
    public static void theNumberIsZero(int n) {

        System.out.printf("The number %d is zero.", n);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        if (n > 0) {
            positiveNumber(n);
        } else if (n < 0) {
            negativeNumber(n);
        } else {
            theNumberIsZero(n);
        }

    }
}
