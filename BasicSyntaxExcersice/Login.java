package TechModule.BasicSyntaxExcersice;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String password = scanner.nextLine();
        String reverse = new StringBuffer(password).reverse().toString();
        int counter = 0;

        while (true) {
            counter++;
            String word = scanner.nextLine();

            if (word.equalsIgnoreCase(reverse)) {
                break;
            }

            if (counter == 4) {
                System.out.printf("User %s blocked!", password);
                return;
            }

            System.out.println("Incorrect password. Try again.");
        }

        System.out.printf("User %s logged in.", password);
    }
}