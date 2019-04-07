package TechModule.TechExams;

import java.util.Scanner;

public class DungeonestDark {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int health = 100;
        int heal = 0;
        int coins = 0;

        String[] rooms = scanner.nextLine().split("\\|+");

        for (int i = 0; i < rooms.length; i++) {
            String[] command = rooms[i].split(" ");

            int number = Integer.parseInt(command[1]);

            if (command[0].equalsIgnoreCase("potion")) {
                if (health + number >= 100) {
                    heal = 100 - health;
                    health = 100;
                    System.out.printf("You healed for %d hp.%n", heal);
                    System.out.printf("Current health: %d hp.%n", health);
                    continue;
                } else {
                    health += number;
                    System.out.printf("You healed for %d hp.%n", number);
                    System.out.printf("Current health: %d hp.%n", health);
                    continue;
                }
            }
            if (command[0].equalsIgnoreCase("chest")) {
                coins += number;
                System.out.printf("You found %d coins.%n", number);
                continue;
            }
            if (health > number) {
                health -= number;
                System.out.printf("You slayed %s.%n", command[0]);
            } else {
                System.out.printf("You died! Killed by %s.%n", command[0]);
                System.out.printf("Best room: %d%n", i + 1);
                return;
            }
        }
        System.out.printf("You've made it!%nCoins: %d%nHealth: %d", coins, health);
    }
}

