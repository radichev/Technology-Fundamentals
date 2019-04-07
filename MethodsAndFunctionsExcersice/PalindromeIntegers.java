package TechModule.MethodsAndFunctionsExcersice;

import java.util.Scanner;

public class PalindromeIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("END")) {
                return;
            } else {
                int num = Integer.parseInt(input);

                palindrome(num);
            }
        }
    }

    static int palindrome(int num) {
        int lastDigit = 0;
        int temp = num;
        int sum = 0;
        while (num > 0) {
            lastDigit = num % 10;

            sum = sum * 10 + lastDigit;
            num = num / 10;
        }
        if (sum == temp) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
        return num;
    }
}
