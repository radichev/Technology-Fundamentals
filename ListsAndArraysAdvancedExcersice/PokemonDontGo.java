package TechModule.ListsAndArraysAdvancedExcersice;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PokemonDontGo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers =
                Arrays.stream(scanner.nextLine().split("\\s+"))
                        .map(Integer::parseInt)
                        .collect(Collectors.toList());

        int value = 0;
        int sum = 0;
        int second = 0;

        while (true) {
            if (numbers.isEmpty()) {
                break;
            }

            int command = Integer.parseInt(scanner.nextLine());
            if (command < 0) {
                value = numbers.get(0);
                numbers.set(0, numbers.get(numbers.size() - 1));
                sum += value;
            } else if (command > numbers.get(numbers.size() - 1)) {
                value = numbers.get(numbers.size() - 1);
                numbers.set(numbers.size() - 1, numbers.get(0));
                sum += value;
            } else {
                value = numbers.get(command);
                numbers.remove(command);
                sum += value;

                for (int i = 0; i < numbers.size(); i++) {
                    if (numbers.get(i) <= value) {
                        numbers.set(i, numbers.get(i) + value);
                    } else if (numbers.get(i) > value) {
                        numbers.set(i, numbers.get(i) - value);
                    }
                }
            }
        }
        System.out.println(sum);
    }
}

