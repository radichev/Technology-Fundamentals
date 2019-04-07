package TechModule.TechMidExam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> input =
                Arrays.stream(scanner.nextLine().split("\\|+"))
                        .collect(Collectors.toList());

        double profit = 0;

        double budget = Double.parseDouble(scanner.nextLine());

        double budgetWithProfit = 0;

        List<Double> newPrice = new ArrayList<>();

        for (int i = 0; i < input.size(); i++) {
            String[] command = input.get(i).split("->");

            double price = Double.parseDouble(command[1]);


            if (command[0].equalsIgnoreCase("Clothes")) {
                if (price > 50.00) {
                    continue;
                } else {
                    if (budget >= price) {
                        budget -= price;
                        newPrice.add(price + (price * 0.4));
                        profit += price * 0.4;
                        budgetWithProfit += (price + (price * 0.4));
                    }
                }
            }
            if (command[0].equalsIgnoreCase("Shoes")) {
                if (price > 35.00) {
                    continue;
                } else {
                    if (budget >= price) {
                        budget -= price;
                        newPrice.add(price + (price * 0.4));
                        profit += price * 0.4;
                        budgetWithProfit += (price + (price * 0.4));
                    }
                }
            }
            if (command[0].equalsIgnoreCase("Accessories")) {
                if (price > 20.50) {
                    continue;
                } else {
                    if (budget >= price) {
                        budget -= price;
                        newPrice.add(price + (price * 0.4));
                        profit += price * 0.4;
                        budgetWithProfit += (price + (price * 0.4));
                    }
                }
            }
        }
        for (int i = 0; i < newPrice.size(); i++) {
            if (i == newPrice.size() - 1) {
                System.out.printf("%.2f%n", newPrice.get(i));
            } else {
                System.out.printf("%.2f ", newPrice.get(i));
            }
        }
        System.out.printf("Profit: %.2f%n", profit);

        budgetWithProfit += budget;

        if (budgetWithProfit >= 150) {
            System.out.println("Hello, France!");
        } else {
            System.out.println("Time to go.");
        }
    }
}
