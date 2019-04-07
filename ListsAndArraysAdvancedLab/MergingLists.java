package TechModule.ListsAndArraysAdvancedLab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MergingLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> first =
                Arrays.stream(scanner.nextLine().split(" "))
                        .map(Integer::parseInt)
                        .collect(Collectors.toList());

        List<Integer> second =
                Arrays.stream(scanner.nextLine().split(" "))
                        .map(Integer::parseInt)
                        .collect(Collectors.toList());

        List<Integer> result = new ArrayList<>();

        if (first.size() > second.size()) {
            for (int i = 0; i < second.size(); i++) {
                result.add(first.get(i));
                result.add(second.get(i));

                if (i == second.size() - 1) {
                    i++;
                    for (int j = 0; j < first.size() - second.size(); j++) {
                        result.add(first.get(i));
                        i++;
                    }
                }
            }
        } else {
            for (int i = 0; i < first.size(); i++) {
                result.add(first.get(i));
                result.add(second.get(i));
                if (i == first.size() - 1) {
                    i++;
                    for (int j = 0; j < second.size() - first.size(); j++) {
                        result.add(second.get(i));
                        i++;
                    }
                }
            }
        }
        System.out.println(result.toString().replaceAll("[\\[,\\]]", ""));
    }
}
