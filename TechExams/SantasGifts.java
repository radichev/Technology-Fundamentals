package TechModule.TechExams;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SantasGifts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numCommands = Integer.parseInt(scanner.nextLine());

        List<Integer> houses =
                Arrays.stream(scanner.nextLine().split("\\s+"))
                        .map(Integer::parseInt)
                        .collect(Collectors.toList());

        int santaIndex = 0;

        for (int i = 0; i < numCommands; i++) {
            String[] command = scanner.nextLine().split("\\s+");
            int value = Integer.parseInt(command[1]);

            if (value > houses.size() - 1 || value < 0) {
                if (command[0].equalsIgnoreCase("Swap")) {

                } else {
                    continue;
                }

            }
            if (command[0].equalsIgnoreCase("Forward")) {
                if (santaIndex + value > houses.size() - 1 || santaIndex + value < 0) {
                    continue;
                } else {
                    santaIndex += value;
                    houses.remove(santaIndex);
                }

            }
            if (command[0].equalsIgnoreCase("Back")) {
                if (santaIndex - value < 0 || santaIndex - value > houses.size() - 1) {
                    continue;
                } else {
                    santaIndex -= value;
                    houses.remove(santaIndex);
                }
            }

            if (command[0].equalsIgnoreCase("Gift")) {
                santaIndex = value;
                houses.add(value, Integer.parseInt(command[2]));

            }
            if (command[0].equalsIgnoreCase("Swap")) {
                int firstIndex = houses.indexOf(value);
                int secondIndex = houses.indexOf(Integer.parseInt(command[2]));
                if (firstIndex > houses.size() - 1 || firstIndex < 0 || secondIndex > houses.size() - 1 || secondIndex < 0) {
                    continue;
                } else {
                    houses.remove(firstIndex);
                    houses.add(firstIndex, Integer.parseInt(command[2]));
                    houses.set(secondIndex, value);
                }

            }
        }
        System.out.printf("Position: %d%n", santaIndex);

        for (int i = 0; i < houses.size(); i++) {
            if (i == houses.size() - 1) {
                System.out.print(houses.get(i));
            } else {
                System.out.print(houses.get(i) + ", ");
            }
        }
    }
}
