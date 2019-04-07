package TechModule.DemoFinalExam;

import java.util.*;
import java.util.stream.Collectors;

public class Dictionary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        TreeMap<String, List<String>> words = new TreeMap<>();
        LinkedHashMap<String, List<String>> finalWords = new LinkedHashMap<>();

        String wordsAndDescriptions = scanner.nextLine();
        String toCheckWords = scanner.nextLine();
        String command = scanner.nextLine();

        String[] firstSplit = wordsAndDescriptions.split("\\s+\\|\\s+");

        for (int i = 0; i < firstSplit.length; i++) {
            String[] secondSplit = firstSplit[i].split(":\\s+");

            String key = secondSplit[0];
            String value = secondSplit[1];

            if (!words.containsKey(key)) {
                words.put(key, new ArrayList<>());
            }
            words.get(key).add(value);
        }

        String[] secondLine = toCheckWords.split("\\s+\\|\\s+");

        if (command.equalsIgnoreCase("End")) {
            for (String word : secondLine) {
                if (words.containsKey(word)) {
                    finalWords.putIfAbsent(word, words.get(word));
                }
            }
            for (var kvp : finalWords.entrySet()) {
                System.out.println(kvp.getKey());
                List<String> innerList = kvp.getValue()
                        .stream()
                        .sorted((e1, e2) -> Integer.compare(e2.length(), e1.length()))
                        .collect(Collectors.toList());

                for (var str : innerList) {
                    System.out.printf(" -%s%n", str);
                }
            }

        }

        if (command.equalsIgnoreCase("List")) {
            words.entrySet().forEach(e -> System.out.printf("%s ", e.getKey()));
        }
    }
}

