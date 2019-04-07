package TechModule.Arrays;

import java.util.Scanner;

public class EqualArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input1 = scanner.nextLine().split(" ");
        String[] input2 = scanner.nextLine().split(" ");

        int[] arr1 = new int[input1.length];
        int[] arr2 = new int[input2.length];
        boolean isEqual = false;
        int index = 0;
        int sum = 0;

        for (int i = 0; i < input1.length; i++) {
            arr1[i] = Integer.parseInt(input1[i]);
        }
        for (int i = 0; i < input2.length; i++) {
            arr2[i] = Integer.parseInt(input2[i]);
        }

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] == arr2[i]) {
                sum += arr1[i];
                isEqual = true;
            } else {
                index = i;
                isEqual = false;
                break;
            }
        }

        if (isEqual) {
            System.out.printf("Arrays are identical. Sum: %d", sum);
        } else {
            System.out.printf("Arrays are not identical. Found difference at %d index.", index);
        }

    }
}
