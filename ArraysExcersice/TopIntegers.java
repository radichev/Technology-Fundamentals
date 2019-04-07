package TechModule.ArraysExcersice;

import java.util.Scanner;

public class TopIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] arr = scanner.nextLine().split(" ");
        int[] intarr = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            intarr[i] = Integer.parseInt(arr[i]);
        }

        for (int i = 0; i < intarr.length; i++) {
            boolean isGreater = true;
            for (int j = i +1; j < intarr.length; j++) {
                if (intarr[i] <= intarr [j]) {
                    isGreater = false;
                    break;
                }
            }
            if (isGreater) {
                System.out.print(intarr[i] + " ");
            }
        }
    }
}
