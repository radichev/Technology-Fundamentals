package TechModule.AssociativeArraysExercise;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class SoftUniParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedHashMap<String, String> parking = new LinkedHashMap<>();

        int numberOfCommands = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < numberOfCommands; i++) {
            String[] command = scanner.nextLine().split("\\s+");
            String name = command[1];
            if (command[0].equalsIgnoreCase("register")) {
                String licensePlate = command[2];

                if (!parking.containsKey(name)) {
                    parking.put(name, licensePlate);
                    System.out.printf("%s registered %s successfully%n", name, licensePlate);
                } else {
                    System.out.printf("ERROR: already registered with plate number %s%n", licensePlate);
                }
            }
            if (command[0].equalsIgnoreCase("unregister")) {
                if (!parking.containsKey(name)) {
                    System.out.printf("ERROR: user %s not found%n", name);
                } else {
                    parking.remove(name);
                    System.out.printf("%s unregistered successfully%n", name);
                }
            }
        }
        parking.forEach((key, value) -> System.out.println(String.format("%s => %s", key, value)));
    }
}
