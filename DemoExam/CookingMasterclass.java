package TechModule.DemoExam;

import java.util.Scanner;

public class CookingMasterclass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int students = Integer.parseInt(scanner.nextLine());
        double flourPrice = Double.parseDouble(scanner.nextLine());
        double eggPrice = Double.parseDouble(scanner.nextLine());
        double apronPrice = Double.parseDouble(scanner.nextLine());

        double oneStudent = flourPrice * students + (10 * eggPrice) * students + apronPrice * (students + Math.ceil(students * 0.2));

        for (int i = 1; i <= students; i++) {
            if (i % 5 == 0) {
                oneStudent -= flourPrice;
            }
        }

        double diff = Math.abs(oneStudent - budget);

        if (oneStudent <= budget) {
            System.out.printf("Items purchased for %.2f$.", oneStudent);
        } else {
            System.out.printf("%.2f$ more needed.", diff);
        }
    }
}
