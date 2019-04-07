package TechModule.DataTypesAndVariablesExcersice;

import java.util.Scanner;

public class BeerKegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double max = Double.MIN_VALUE;

        int n = Integer.parseInt(scanner.nextLine());
        String typeMax = "";
        for (int i = 0; i < n; i++) {
            String type = scanner.nextLine();
            double radius = Double.parseDouble(scanner.nextLine());
            int height = Integer.parseInt(scanner.nextLine());

            double volume = Math.PI * Math.pow(radius, 2) * height;


            if (volume > max) {
                max = volume;
                typeMax = type;
            }
        }
        System.out.println(typeMax);
    }
}
