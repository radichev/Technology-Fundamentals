package TechModule.BasicSyntaxExcersice;

import java.util.Scanner;

public class PrintAndSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstSum = Integer.parseInt(scanner.nextLine());
        int secondSum = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        for (int i = firstSum; i <= secondSum; i++) {
            System.out.print(i + " ");
            sum += i;
        }
        System.out.println();
        System.out.printf("Sum: %d", sum);
    }
}
