package TechModule.BasicSyntaxExcersice;

import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String numberInput = scanner.nextLine();
        long sum = 0;

// Factorial the num 5 is shown as 1*2*3*4*5

        for (int i = 0; i < numberInput.length() ; i++) {
            int number = Integer.parseInt(String.valueOf(numberInput.charAt(i)));

            int factorial = 1;

            for (int j = 1; j <= number; j++) {
                factorial *= j;
            }

            sum += factorial;
        }

// replace if statement

        System.out.println(numberInput.equals(String.valueOf(sum)) ? "yes" : "no");
    }
}
