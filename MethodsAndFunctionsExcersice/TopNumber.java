package TechModule.MethodsAndFunctionsExcersice;

import java.util.Scanner;

public class TopNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        topNumber(number);
    }

    static int topNumber(int num) {
        boolean isTop = false;
        int sum = 0;
        for (int i = 0; i < num; i++) {
            sum = sum + i+1;

            if (sum / 8 == 0) {
                System.out.println(i);
            }
        }
        return num;
    }
}
