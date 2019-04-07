package TechModule.MethodsAndFunctions;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MathPower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        DecimalFormat format = new DecimalFormat("#.#########");
        double number = Double.parseDouble(scanner.nextLine());
        int pow  = Integer.parseInt(scanner.nextLine());

        double result  = pow(number, pow);

        System.out.println(result);
    }

    static double pow(double number, int pow) {
        double result = 1;

        for (int i = 1; i <= pow ; i++) {
            result *= number;

        }
    return result;
    }


}
