package TechModule.TextProcessingAndRegularExpressionsExercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StarEnigma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countOfMessages = Integer.parseInt(scanner.nextLine());

        String regex = "[star]";

        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);

        String nextRegex = "@(?<planet>[A-Za-z]+)(?:[^@\\-!:>]*):" +
                "(?<population>\\d+)(?:[^@\\-!:>]*)!" +
                "(?<type>[AD]+)!(?:[^@\\-!:>]*)->" +
                "(?<soldiers>\\d+)";

        Pattern nextPattern = Pattern.compile(nextRegex);

        List<String> attacked = new ArrayList<>();
        List<String> destroyed = new ArrayList<>();

        for (int i = 0; i < countOfMessages; i++) {

            String input = scanner.nextLine();

            Matcher matcher = pattern.matcher(input);

            int count = 0;

            while (matcher.find()) {
                count++;
            }

            StringBuilder result = new StringBuilder();

            for (int j = 0; j < input.length(); j++) {
                int chars = input.charAt(j) - count;
                result.append((char) chars);
            }

            Matcher nextMatcher = nextPattern.matcher(result);

            if (nextMatcher.find()) {
                if (nextMatcher.group("type").equalsIgnoreCase("A")) {
                    attacked.add(nextMatcher.group("planet"));
                } else {
                    destroyed.add(nextMatcher.group("planet"));
                }
            }
        }
        System.out.printf("Attacked planets: %d%n", attacked.size());
        attacked.stream().sorted((e1, e2) -> e1.compareTo(e2)).forEach(e -> System.out.printf("-> %s%n", e));

        System.out.printf("Destroyed planets: %d%n", destroyed.size());
        destroyed.stream().sorted((e1, e2) -> e1.compareTo(e2)).forEach(e -> System.out.printf("-> %s%n", e));
    }
}
