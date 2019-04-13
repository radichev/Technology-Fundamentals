package TechModule.TechArchiveFinalExams;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ChoreWars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String dishRegex = "<(?<dishes>[a-z\\d]+)>";
        String cleaningRegex = "\\[(?<cleaning>[A-Z\\d]+)\\]";
        String laundryRegex = "\\{(?<laundry>.+)\\}";

        Pattern dishPattern = Pattern.compile(dishRegex);
        Pattern cleaningPattern = Pattern.compile(cleaningRegex);
        Pattern laundryPattern = Pattern.compile(laundryRegex);

        int dishTime = 0;
        int cleaningTime = 0;
        int laundryTime = 0;
        int total = 0;

        while (true) {
            String input = scanner.nextLine();

            if (input.equals("wife is happy")) {
                break;
            }

            Matcher dishMatcher = dishPattern.matcher(input);

            if (dishMatcher.find()) {
                String dishes = dishMatcher.group("dishes");

                for (int i = 0; i < dishes.length(); i++) {
                    if (Character.isDigit(dishes.charAt(i))) {
                        dishTime += Character.getNumericValue(dishes.charAt(i));
                        total += Character.getNumericValue(dishes.charAt(i));
                    }
                }
            }
            Matcher cleanMatcher = cleaningPattern.matcher(input);

            if (cleanMatcher.find()) {
                String cleaning = cleanMatcher.group("cleaning");

                for (int i = 0; i < cleaning.length(); i++) {
                    if (Character.isDigit(cleaning.charAt(i))) {
                        cleaningTime += Character.getNumericValue(cleaning.charAt(i));
                        total += Character.getNumericValue(cleaning.charAt(i));
                    }
                }
            }
            Matcher laundryMatcher = laundryPattern.matcher(input);

            if (laundryMatcher.find()) {
                String laundry = laundryMatcher.group("laundry");

                for (int i = 0; i < laundry.length(); i++) {
                    if (Character.isDigit(laundry.charAt(i))) {
                        laundryTime += Character.getNumericValue(laundry.charAt(i));
                        total += Character.getNumericValue(laundry.charAt(i));
                    }
                }
            }
        }
        System.out.printf("Doing the dishes - %d min.%n", dishTime);
        System.out.printf("Cleaning the house - %d min.%n", cleaningTime);
        System.out.printf("Doing the laundry - %d min.%n", laundryTime);
        System.out.printf("Total - %d min.", total);
    }
}
