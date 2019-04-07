package TechModule.DemoExam;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BreadFactory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> events =
                Arrays.stream(scanner.nextLine().split("\\|+"))
                        .collect(Collectors.toList());

        int energy = 100;
        int coins = 100;

        int heal = 0;

        for (int i = 0; i < events.size(); i++) {
            String[] command = events.get(i).split("\\-+");

            int number = Integer.parseInt(command[1]);

            if (command[0].equalsIgnoreCase("rest")) {
                if (energy + number >= 100) {
                    heal = 100 - energy;
                    energy = 100;
                    System.out.printf("You gained %d energy.%n", heal);
                    System.out.printf("Current energy: %d.%n", energy);
                    continue;
                } else {
                    energy += number;
                    System.out.printf("You gained %d energy.%n", number);
                    System.out.printf("Current energy: %d.%n", energy);
                    continue;
                }
            }
            if (command[0].equalsIgnoreCase("order")) {

                if (energy < 30) {
                    energy += 50;
                    System.out.println("You had to rest!");
                    continue;
                } else {
                    coins += number;
                    System.out.printf("You earned %d coins.%n", number);
                    energy -= 30;
                    continue;
                }
            }
            if (coins > number) {
                coins -= number;
                System.out.printf("You bought %s.%n", command[0]);
            } else {
                System.out.printf("Closed! Cannot afford %s.%n", command[0]);
                return;
            }
        }
        System.out.printf("Day completed!%nCoins: %d%nEnergy: %d%n", coins, energy);
    }
}
