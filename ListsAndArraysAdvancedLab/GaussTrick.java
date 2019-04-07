package TechModule.ListsAndArraysAdvancedLab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class GaussTrick {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers =
                Arrays.stream(scanner.nextLine().split(" "))
                        .map(Integer::parseInt)
                        .collect(Collectors.toList());

        int middle = 0;

        if (numbers.size() % 2 == 0) {
            for (int i = 0; i < numbers.size() - 1; i++) {
                numbers.set(i, (numbers.get(i) + numbers.get(numbers.size() - 1)));
                numbers.remove(numbers.size() - 1);
                if (i == numbers.size()) {
                    break;
                }
            }
        } else {
            middle = numbers.get(numbers.size() / 2);

            for (int i = 0; i < numbers.size(); i++) {
                numbers.set(i, (numbers.get(i) + numbers.get(numbers.size() - 1)));
                if (i == numbers.size() - 1) {
                    numbers.set(i, middle);
                    break;
                } else {
                    numbers.remove(numbers.size() - 1);
                }
            }
        }
    }
}

