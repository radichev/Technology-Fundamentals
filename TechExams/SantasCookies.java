package TechModule.TechExams;

import java.util.Scanner;

public class SantasCookies {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        int numUsers = Integer.parseInt(scanner.nextLine());
        double moneyPerSearch = Double.parseDouble(scanner.nextLine());

        double money = 0;
        boolean is = false;


        for (int i = 1; i <= numUsers; i++) {
            int words = Integer.parseInt(scanner.nextLine());

            if (words > 5) {
                continue;
            }
            if (words == 1) {
                money += (moneyPerSearch * 2);
                is = true;
            }
            if (i % 3 == 0) {
                money += (moneyPerSearch * 4);
                is = true;
            }

            if (!is) {
                money += moneyPerSearch;
            }
        }

        money *= days;

        System.out.printf("Total money earned for %d days: %.2f", days, money);
    }
}
