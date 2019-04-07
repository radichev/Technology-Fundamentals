package TechModule.TextProcessingAndRegularExpressionsExercise;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Furniture {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String regex = ">>(?<item>[A-Za-z]+)<<(?<price>\\d+(.?\\d+)?)!(?<quantity>\\d+)";

        double sum = 0;

        boolean flag = false;

        while (true) {
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("Purchase")) {
                break;
            }

            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(input);

            if (matcher.find()) {
                String product = matcher.group(1);
                double price = Double.parseDouble(matcher.group(2));
                int quantity = Integer.parseInt(matcher.group(4));

                sum += price * quantity;

                if (!flag) {
                    System.out.println("Bought furniture:");
                    flag = true;
                }
                System.out.printf("%s%n", product);
            }
        }
        System.out.printf("Total money spend: %.2f", sum);
    }
}
