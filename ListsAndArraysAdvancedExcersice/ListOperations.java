package TechModule.ListsAndArraysAdvancedExcersice;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListOperations {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> numbers =
                Arrays.stream(scanner.nextLine().split("\\s+"))
                        .collect(Collectors.toList());

        String temp = "";

        if (numbers.isEmpty()) {
            return;
        }

        while (true) {
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("End")) {
                break;
            }
            String[] command = input.split("\\s+");

            switch (command[0]) {
                case "Add":
                    String add = command[1];
                    numbers.add(add);
                    break;
                case "Remove":
                    int removeIt = Integer.parseInt(command[1]);
                    if (removeIt >= 0 && removeIt < numbers.size()) {
                        numbers.remove(removeIt);
                    } else {
                        System.out.println("Invalid index");
                    }
                    break;
                case "Insert":
                    String number = command[1];
                    int position = Integer.parseInt(command[2]);
                    if (position >= 0 && position < numbers.size()) {
                        numbers.add(position, number);
                    } else {
                        System.out.println("Invalid index");
                    }
                    break;
                case "Shift":
                    switch (command[1]) {
                        case "left":
                            for (int i = 0; i < Integer.parseInt(command[2]); i++) {
                                temp = numbers.get(0);
                                numbers.remove(0);
                                numbers.add(temp);
                            }
                            break;
                        case "right":
                            for (int i = 0; i < Integer.parseInt(command[2]); i++) {
                                temp = numbers.get(numbers.size() - 1);
                                numbers.remove(numbers.size() - 1);
                                numbers.add(0, temp);
                            }
                            break;
                    }
            }
        }
        System.out.println(numbers.toString().replaceAll("[\\[,\\]]", ""));
    }
}


