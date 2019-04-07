package TechModule.DataTypesAndVariables;

import java.math.BigDecimal;
import java.util.Scanner;

public class ExactSumOfRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int nums = Integer.parseInt(scanner.nextLine());
        BigDecimal sum  = new BigDecimal("0");
        for (int i = 0; i < nums; i++) {
            String number = scanner.nextLine();
            BigDecimal decimal = new BigDecimal(number);

            sum = sum.add(decimal);
        }

        System.out.println(sum);
    }
}
