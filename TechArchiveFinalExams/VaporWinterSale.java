package TechModule.TechArchiveFinalExams;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Scanner;

public class VaporWinterSale {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedHashMap<String, List<String>> games = new LinkedHashMap<>();

        String input = scanner.nextLine();

        String[] firstSplit = input.split(", ");

        for (String word : firstSplit) {

            if (word.contains(":")) {
                String[] thirdSplit = word.split(":");
                if (games.containsKey(thirdSplit[0])) {
                    games.get(thirdSplit[0]).add(thirdSplit[1]);
                }
            } else {
                String[] secondSplit = word.split("-");
                if (!games.containsKey(word)) {
                    games.put(secondSplit[0], new ArrayList<>());
                }
                games.get(secondSplit[0]).add(secondSplit[1]);
            }
        }
        for (var kvp : games.entrySet()) {
            if (kvp.getValue().size() > 1) {

                double num = Double.parseDouble(kvp.getValue().get(0));
                double plusNum = Double.parseDouble(kvp.getValue().get(0)) + (num * 0.2);
                plusNum *= 0.5;
                String replaced = String.valueOf(String.format("%.2f", plusNum));
                kvp.getValue().set(0, replaced);
            } else {

                double num = Double.parseDouble(kvp.getValue().get(0));
                num *= 0.2;
                double minusNum = Double.parseDouble(kvp.getValue().get(0)) - num;
                String replaced = String.valueOf(String.format("%.2f", minusNum));
                kvp.getValue().set(0, replaced);
            }
        }
        games.entrySet()
                .stream()
                .filter(e -> e.getValue().size() > 1)
                .sorted((x1, x2) -> Double.compare(Double.parseDouble(x1.getValue().get(0)), Double.parseDouble(x2.getValue().get(0))))
                .forEach(p -> System.out.printf("%s - %s - %s%n", p.getKey(), p.getValue().get(1), p.getValue().get(0)));

        games.entrySet()
                .stream()
                .filter(e -> e.getValue().size() == 1)
                .sorted((x1, x2) -> Double.compare(Double.parseDouble(x2.getValue().get(0)), Double.parseDouble(x1.getValue().get(0))))
                .forEach(p -> System.out.printf("%s - %s%n", p.getKey(), p.getValue().get(0)));
    }
}
