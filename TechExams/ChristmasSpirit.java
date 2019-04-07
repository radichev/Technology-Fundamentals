package TechModule.TechExams;

import java.util.Scanner;

public class ChristmasSpirit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int quantity = Integer.parseInt(scanner.nextLine());
        int days = Integer.parseInt(scanner.nextLine());

        int ornamentSet = 2;
        int treeSkirt = 5;
        int treeGarlands = 3;
        int treeLights = 15;

        int christmasSpirit = 0;
        int totalCost = 0;

        for (int i = 1; i <= days; i++) {

            if (i % 11 == 0) {
                quantity += 2;
            }
            if (i % 2 == 0) {
                totalCost += ornamentSet * quantity;
                christmasSpirit += 5;
            }
            if (i % 3 == 0) {
                totalCost += treeGarlands * quantity;
                totalCost += treeSkirt * quantity;
                christmasSpirit += 13;
            }
            if (i % 5 == 0) {
                if (i % 3 == 0) {
                    totalCost += treeLights * quantity;
                    christmasSpirit += 47;
                } else {
                    totalCost += treeLights * quantity;
                    christmasSpirit += 17;
                }
            }
            if (i % 10 == 0) {
                christmasSpirit -= 20;
                totalCost += treeLights;
                totalCost += treeGarlands;
                totalCost += treeSkirt;
            }
            if (i == days && i % 10 == 0) {
                christmasSpirit -= 30;
            }
        }
        System.out.printf("Total cost: %d\n", totalCost);
        System.out.printf("Total spirit: %d", christmasSpirit);
    }
}