package TechModule.ArraysExcersice;

import java.util.Scanner;

public class ZigZagArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        String[] first = new String[2 * n];

        int index = 0;
        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split(" ");

            if (i % 2 == 0) {
                first[index++] = input[0];
                first[index++] = input[1];
            } else {
                first[index++] = input[1];
                first[index++] = input[0];
            }
        }

        String firstOutput = "";
        String secondOutput = "";

        for (int i = 0; i < first.length; i++) {
            if (i % 2 == 0) {
                firstOutput += first[i] + " ";
            } else {
                secondOutput += first[i] + " ";
            }
        }
        System.out.println(firstOutput);
        System.out.println(secondOutput);
    }
}
