package TechModule.ListsAndArraysAdvancedLab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationBasics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers =
                Arrays.stream(scanner.nextLine().split(" "))
                        .map(Integer::parseInt)
                        .collect(Collectors.toList());

        while (true) {
            String command = scanner.nextLine();

            if (command.equalsIgnoreCase("end")) {
                break;
            }

            String[] input = command.split(" ");


                switch (input[0]) {
                    case "Add":
                        int numberToAdd = Integer.parseInt(input[1]);
                        numbers.add(numberToAdd);
                        break;
                    case "Remove":
                        int numberToRemove = Integer.parseInt(input[1]);
                        numbers.remove(numberToRemove);
                        break;
                    case "RemoveAt":
                        int indexToRemove = Integer.parseInt(input[1]);
                        numbers.remove(indexToRemove);
                        break;
                    case "Insert":
                        int numberToInsert = Integer.parseInt(input[1]);
                        int indexToInsert = Integer.parseInt(input[2]);
                        numbers.add(indexToInsert, numberToInsert);
                        break;
                    default:
                        return;
                }

        }
        System.out.println(numbers.toString().replaceAll("[\\[,\\]]", ""));

    }

}
