package TechModule.ListsAndArraysAdvancedLab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationAdvanced {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers =
                Arrays.stream(scanner.nextLine().split(" "))
                        .map(Integer::parseInt)
                        .collect(Collectors.toList());

        int sum = 0;

        while (true) {
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("end")) {
                break;
            }

            String[] command = input.split(" ");

            switch (command[0]) {
                case "Contains":
                    int contains = Integer.parseInt(command[1]);
                    numbers.contains(contains);
                    break;
                case "Print":
                    switch (command[1]) {
                        case "even":
                            for (int i = 0; i < numbers.size(); i++) {
                                if (numbers.get(i) % 2 == 0) {
                                    System.out.println(numbers.get(i).toString().replaceAll("[\\[,\\]]", ""));
                                }
                            }
                            break;
                        case "odd":
                            for (int i = 0; i < numbers.size(); i++) {
                                if (numbers.get(i) % 2 == 1) {
                                    System.out.println(numbers.get(i).toString().replaceAll("[\\[,\\]]", ""));
                                }
                            }
                            break;
                    }
                case "Get":
                    for (int i = 0; i < numbers.size(); i++) {
                        sum += numbers.get(i);
                    }
                    break;
                case "Filter":
                    switch (command[1]) {
                        case "<":
 //                           System.out.println(String.join(" ", numbers.forEach(n => n < Filter));
                            break;
                        case ">":

                            break;
                        case "<=":

                            break;
                        case ">=":

                            break;
                    }
            }
        }
    }
}