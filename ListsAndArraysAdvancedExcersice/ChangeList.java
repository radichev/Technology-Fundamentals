package TechModule.ListsAndArraysAdvancedExcersice;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ChangeList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> numbers =
                Arrays.stream(scanner.nextLine().split(" "))
                        .collect(Collectors.toList());

        while (true) {
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("end")) {
                break;
            }

            String[] command = input.split(" ");

            switch (command[0]) {
                case "Delete":
                    numbers = numbers.stream()
                            .filter(e -> !e.equals(command[1]))
                            .collect(Collectors.toList());
                    break;
                case "Insert":
                    String number = command[1];
                    int position = Integer.parseInt(command[2]);
                    if (position >= 0 && position < numbers.size()) {
                        numbers.add(position, number);
                    }
                    break;
            }
        }
        System.out.println(numbers.toString().replaceAll("[\\[,\\]]", ""));
    }
}
