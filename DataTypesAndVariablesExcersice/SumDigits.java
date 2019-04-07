package TechModule.DataTypesAndVariablesExcersice;

import java.util.Scanner;

public class SumDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String numberInput = scanner.nextLine();

        int sum = 0;
        for (int i = 0; i < numberInput.length(); i++) {
            int digit = numberInput.charAt(i) - 48;

            sum += digit;
        }
        System.out.println(sum);
    }
}
