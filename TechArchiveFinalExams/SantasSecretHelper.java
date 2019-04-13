package TechModule.TechArchiveFinalExams;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SantasSecretHelper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int key = Integer.parseInt(scanner.nextLine());

        String regex = "@(?<name>[A-Za-z]+)(?:[^\\@\\-\\!\\:\\>]+)!(?<behavior>[G|N]*)!";

        Pattern pattern = Pattern.compile(regex);

        List<String> goodKids = new ArrayList<>();

        while (true) {
            String input = scanner.nextLine();
            String decodeMessage = "";

            if (input.equalsIgnoreCase("end")) {
                break;
            }

            for (int i = 0; i < input.length(); i++) {
                char decode = (char) (input.charAt(i) - key);
                decodeMessage += decode;
            }

            Matcher matcher = pattern.matcher(decodeMessage);

            if (matcher.find()) {
                String name = matcher.group("name");
                String behavior = matcher.group("behavior");

                if (behavior.equalsIgnoreCase("G")) {
                    goodKids.add(name);
                }
            }
        }
        goodKids.forEach(e -> System.out.printf("%s%n", e));
    }
}
