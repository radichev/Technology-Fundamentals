package TechModule.AssociativeArraysLab;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class WordSynonyms {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedHashMap<String, ArrayList<String>> words = new LinkedHashMap<>();

        int count = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < count; i++) {
            String word = scanner.nextLine();
            String synonym = scanner.nextLine();

            words.putIfAbsent(word, new ArrayList<>());
            words.get(word).add(synonym);
        }

        words.forEach((key, value) -> System.out.printf("%s - %s%n", key, String.join(", ", words.get(key))));
    }
}
