package TechModule.ArraysExcersice;

import java.util.Scanner;

public class EqualSums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");

        int[] numbers = new int[input.length];

        for (int i = 0; i < input.length; i++) {
            numbers[i] = Integer.parseInt(input[i]);
        }

        for (int i = 0; i < numbers.length; i++) {
            int rightSum = 0;


            for (int j = 0; j < i; j++) {

                rightSum += numbers[j];
            }
            int leftSum = 0;

            for (int j = i + 1; j < numbers.length; j++) {

                leftSum += numbers[j];
            }
            if (rightSum == leftSum) {
                System.out.println(i);
                return;
            }
        }

        System.out.println("no");

    }
}
