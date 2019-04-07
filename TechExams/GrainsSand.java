package TechModule.TechExams;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class GrainsSand {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers =
                Arrays.stream(scanner.nextLine().split("\\s+"))
                        .map(Integer::parseInt)
                        .collect(Collectors.toList());

        boolean remove = false;

        while (true) {
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("mort")) {
                break;
            }

            String[] command = input.split("\\s+");

            int replaceIndex = 0;
            int increase = Integer.MIN_VALUE;

            int value = Integer.parseInt(command[1]);

            if (command[0].equalsIgnoreCase("add")) {
                numbers.add(value);
            }
            if (command[0].equalsIgnoreCase("remove")) {
                for (int i = 0; i < numbers.size(); i++) {
                    if (numbers.get(i) == value) {
                        int removeIndex = numbers.indexOf(numbers.get(i));
                        numbers.remove(removeIndex);
                        remove = true;
                        break;
                    }
                }
                if (value >= 0 && value < numbers.size() && !remove) {
                    numbers.remove(value);
                }
            }
            if (command[0].equalsIgnoreCase("replace")) {
                for (int i = 0; i < numbers.size(); i++) {
                    if (numbers.get(i) == value) {
                        replaceIndex = numbers.indexOf(numbers.get(i));
                        numbers.set(replaceIndex, Integer.parseInt(command[2]));
                        break;
                    }
                }
            }
            if (command[0].equalsIgnoreCase("increase")) {
                for (int i = 0; i < numbers.size(); i++) {
                    if (numbers.get(i) >= value) {
                        increase = numbers.get(i);
                        break;
                    }
                }
                if (increase >= 0) {
                    for (int i = 0; i < numbers.size(); i++) {
                        numbers.set(i, numbers.get(i) + increase);
                    }
                }
                if (increase == Integer.MIN_VALUE) {
                    increase = numbers.get(numbers.size() - 1);
                    for (int i = 0; i < numbers.size(); i++) {
                        numbers.set(i, numbers.get(i) + increase);
                    }
                }
                increase = Integer.MIN_VALUE;
            }
            if (command[0].equalsIgnoreCase("collapse")) {
                for (int i = 0; i < numbers.size(); i++) {
                    if (numbers.get(i) < value) {
                        numbers.remove(i);
                        i--;
                    }
                }
            }
        }
        for (int i = 0; i < numbers.size(); i++) {
            if (i == numbers.size() - 1) {
                System.out.print(numbers.get(i));
            } else {
                System.out.print(numbers.get(i) + " ");
            }
        }
    }
}
