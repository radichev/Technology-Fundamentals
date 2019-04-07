package TechModule.Arrays;

import java.util.Scanner;

public class SumEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String n = scanner.nextLine();

        String[] text = n.split(" ");
        int sum = 0;

        int[] numbers = new int[text.length];

        for (int i = 0; i < text.length; i++) {
            numbers[i] = Integer.parseInt(text[i]);
        }

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                sum += numbers[i];
            }

        }
        System.out.println(sum);

    }
}
