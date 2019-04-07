package TechModule.BasicSyntaxLab;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum = num * i;

            System.out.printf("%d X %d = %d%n", num, i, sum);
        }
    }
}
