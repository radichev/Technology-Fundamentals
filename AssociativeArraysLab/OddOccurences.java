package TechModule.AssociativeArraysLab;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Scanner;

public class OddOccurences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] words = scanner.nextLine().split(" ");

        LinkedHashMap<String, Integer> counts = new LinkedHashMap<>();

        for (String word : words) {
            String toLowerCase = word.toLowerCase();

            if (counts.containsKey(toLowerCase)) {
                counts.put(toLowerCase, counts.get(toLowerCase) + 1);
            } else {
                counts.put(toLowerCase, 1);
            }
        }
        List<String> oddOccurence = new ArrayList<>();

        for (var entry : counts.entrySet()) {
            if (entry.getValue() % 2 == 1) {
                oddOccurence.add(entry.getKey());
            }
        }
        for (int i = 0; i < oddOccurence.size(); i++) {
            if (i == oddOccurence.size() - 1) {
                System.out.print(oddOccurence.get(i));
            } else {
                System.out.print(oddOccurence.get(i) + ", ");
            }
        }
    }
}
