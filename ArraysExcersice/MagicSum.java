package TechModule.ArraysExcersice;

import java.util.Scanner;

public class MagicSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");

        int result = Integer.parseInt(scanner.nextLine());

        int sum = 0;

        int[] numbers = new int[input.length];

        for (int i = 0; i < input.length; i++) {
            numbers[i] = Integer.parseInt(input[i]);
        }

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i+1; j < numbers.length; j++) {
                sum = numbers[i] + numbers[j];
                if (sum == result) {
                    System.out.print(numbers[i] + " " + numbers[j]);
                    System.out.println();
                }
                sum = 0;
            }

        }
    }
}
