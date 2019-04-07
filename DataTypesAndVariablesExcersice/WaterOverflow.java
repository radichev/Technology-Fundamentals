package TechModule.DataTypesAndVariablesExcersice;

import java.util.Scanner;

public class WaterOverflow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int times = Integer.parseInt(scanner.nextLine());
        int capacity = 255;

        int allLiters = 0;

        for (int i = 0; i < times; i++) {
            int liters = Integer.parseInt(scanner.nextLine());

            allLiters += liters;
            if (capacity < allLiters) {
                System.out.println("Insufficient capacity!");
                allLiters -= liters;
            }
        }
        System.out.println(allLiters);
    }
}
