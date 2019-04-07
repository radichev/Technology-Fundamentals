package TechModule.TextProcessingAndRegularExpressionsExercise;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Race {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedHashMap<String, Integer> results = new LinkedHashMap<>();

        String[] players = scanner.nextLine().split(", ");

        for (int i = 0; i < players.length; i++) {
            results.putIfAbsent(players[i], 0);
        }

        while (true) {
            String name = "";
            int distance = 0;
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("end of race")) {
                break;
            }

            Pattern pattern = Pattern.compile("[A-Za-z]+");
            Matcher matcher = pattern.matcher(input);

            while (matcher.find()) {
                name += matcher.group();
            }

            Pattern patternDigit = Pattern.compile("\\d");
            Matcher matcherDigit = patternDigit.matcher(input);

            while (matcherDigit.find()) {
                distance += Integer.parseInt(matcherDigit.group());
            }

            if (results.containsKey(name)) {
                results.put(name, results.get(name) + distance);
            }
        }
        List<String> names = new LinkedList<>();
        results.entrySet().stream().sorted(Map.Entry.<String, Integer>comparingByValue().reversed()).limit(3)
                .forEach(p -> names.add(p.getKey()));

        System.out.printf("1st place: %s\n" +
                "2nd place: %s\n" +
                "3rd place: %s\n", names.get(0), names.get(1), names.get(2));
    }
}
