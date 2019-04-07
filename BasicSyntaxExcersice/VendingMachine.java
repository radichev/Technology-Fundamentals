package TechModule.BasicSyntaxExcersice;

import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        double sum = 0;
        String name = "";

        while (true) {
            double money = Double.parseDouble(input);

            if ((input.equalsIgnoreCase("end")) || money == 0.10 || money == 0.20
                    || money == 0.50 || money == 1.0 || money == 2.0) {
                sum += money;
            } else {
                System.out.printf("Cannot accept %.2f\n", money);
            }
            input = scanner.nextLine();
            if (input.equalsIgnoreCase("start")) {
                break;
            }
        }

        while (true) {
            input = scanner.nextLine();
            if (input.equalsIgnoreCase("end")) {
                break;
            }

            if (input.equalsIgnoreCase("Nuts")) {
                if (sum >= 2.0) {
                    sum -= 2.0;
                    name = "Nuts";

                    System.out.printf("Purchased %s\n", name);
                } else {
                    System.out.println("Sorry, not enough money");

                }
            } else if (input.equalsIgnoreCase("Water")) {
                if (sum >= 0.7) {
                    sum -= 0.7;
                    name = "Water";

                    System.out.printf("Purchased %s\n", name);
                } else {
                    System.out.println("Sorry, not enough money");

                }
            } else if (input.equalsIgnoreCase("Crisps")) {
                if (sum >= 1.5) {
                    sum -= 1.5;
                    name = "Crisps";

                    System.out.printf("Purchased %s\n", name);
                } else {
                    System.out.println("Sorry, not enough money");

                }
            } else if (input.equalsIgnoreCase("Soda")) {
                if (sum >= 0.8) {
                    sum -= 0.8;
                    name = "Soda";
                    System.out.printf("Purchased %s\n", name);
                } else {
                    System.out.println("Sorry, not enough money");

                }

            } else if (input.equalsIgnoreCase("Coke")) {
                if (sum >= 1.0) {
                    sum -= 1.0;
                    name = "Coke";
                    System.out.printf("Purchased %s\n", name);
                } else {
                    System.out.println("Sorry, not enough money");

                }

            } else {
                System.out.println("Invalid product");
                break;
            }

        }
        System.out.printf("Change: %.2f", sum);
    }
}

