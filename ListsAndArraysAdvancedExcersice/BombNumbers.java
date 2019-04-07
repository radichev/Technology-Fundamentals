package TechModule.ListsAndArraysAdvancedExcersice;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BombNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers =
                Arrays.stream(scanner.nextLine().split("\\s+"))
                        .map(Integer::parseInt)
                        .collect(Collectors.toList());

        List<Integer> numAndPower =
                Arrays.stream(scanner.nextLine().split("\\s+"))
                        .map(Integer::parseInt)
                        .collect(Collectors.toList());

        int index = 0;
        int sum = 0;
        int specialNumer = 0;
        int specialNumCount = 0;
        int positionsInLeft = 0;
        int positionsInRight = 0;
        int sumSpecial = 0;

        if (numbers.isEmpty()) {
            return;
        } else if (numAndPower.isEmpty()) {
            return;
        }

        for (int i = 0; i < numbers.size(); i++) {
            positionsInLeft++;
            if (numbers.get(i).equals(numAndPower.get(0))) {
                positionsInLeft -= 1;
                index = i;
                specialNumer = numbers.get(i);
                specialNumCount++;
                positionsInRight = numbers.size() - 1 - index;
                sumSpecial += specialNumer;

                if (positionsInRight < numAndPower.get(1)) {
                    for (int j = 0; j < positionsInRight; j++) {
                        numbers.remove(index + 1);
                    }
                } else {
                    for (int j = 0; j < numAndPower.get(1); j++) {
                        numbers.remove(index + 1);
                    }
                }
                if (positionsInLeft < numAndPower.get(1)) {
                    for (int j = 0; j < positionsInLeft; j++) {
                        numbers.remove(--index);
                    }
                } else {
                    for (int j = 0; j < numAndPower.get(1); j++) {
                        numbers.remove(--index);
                    }
                }
            }
        }
        for (int j = 0; j < numbers.size(); j++) {
            sum += numbers.get(j);
        }
            sum -= sumSpecial;

        System.out.println(sum);
    }
}
