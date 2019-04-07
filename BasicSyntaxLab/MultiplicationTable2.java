package TechModule.BasicSyntaxLab;

import java.util.Scanner;

public class MultiplicationTable2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        int multiplier = Integer.parseInt(scanner.nextLine());

        int sum = 0;
        if (multiplier > 10) {
            sum = num * multiplier;
            System.out.printf("%d X %d = %d%n", num, multiplier, sum);
            return;
        }
        for (int i = multiplier; i <= 10; i++) {
            sum = num * i;


            System.out.printf("%d X %d = %d%n", num, i, sum);
        }
    }
}
