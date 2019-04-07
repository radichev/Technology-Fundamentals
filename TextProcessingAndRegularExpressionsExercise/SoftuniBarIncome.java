package TechModule.TextProcessingAndRegularExpressionsExercise;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SoftuniBarIncome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String regex = "%(?<customer>[A-Z][a-z]+)%(?:[^|$%.]*)" +
                "<(?<product>[^<>]+)>(?:[^|$%.]*)" +
                "\\|(?<count>\\d+)\\|(?:[^|$%.]*?)" +
                "(?<price>\\d+.?\\d+)\\$";

        Pattern pattern = Pattern.compile(regex);

        double totalPrice = 0;

        while (true) {
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("end of shift")) {
                break;
            }

            Matcher matcher = pattern.matcher(input);

            if (matcher.find()) {
                String customer = matcher.group("customer");
                String product = matcher.group("product");
                int count = Integer.parseInt(matcher.group("count"));
                double price = Double.parseDouble(matcher.group("price"));

                System.out.printf("%s: %s - %.2f%n", customer, product, count * price);
                totalPrice += count * price;
            }
        }
        System.out.printf("Total income: %.2f", totalPrice);
    }
}
