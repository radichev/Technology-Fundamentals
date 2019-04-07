package TechModule.Arrays;

import java.util.Scanner;

public class ExampleFive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");

        int[] numbers = new int[input.length];
        int sumEven = 0;
        int sumOdd = 0;

        for (int i = 0; i < input.length; i++) {
            numbers[i] = Integer.parseInt(input[i]);
        }

        for (int i = 0; i < numbers.length; i++) {
            if (i % 2 == 0) {
                sumEven += numbers[i];
            }else {
                sumOdd += numbers[i];
            }
        }
        int result = sumOdd - sumEven;

        System.out.println(result);
    }
}
