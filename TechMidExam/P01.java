package TechModule.TechMidExam;

import java.util.Scanner;

public class P01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        double budget = Double.parseDouble(scanner.nextLine());
        int group = Integer.parseInt(scanner.nextLine());
        double fuelPerKm = Double.parseDouble(scanner.nextLine());
        double foodExpenses = Double.parseDouble(scanner.nextLine());
        double priceRoomOnePerson = Double.parseDouble(scanner.nextLine());

        double expenses = 0;
        double totalHotel = 0;

        expenses += days * group * foodExpenses;
        totalHotel = days * group * priceRoomOnePerson;

        if (group > 10) {
            expenses += totalHotel - (totalHotel * 0.25);
        } else {
            expenses += totalHotel;
        }


        for (int i = 1; i <= days; i++) {
            double travelledDistance = Double.parseDouble(scanner.nextLine());
            expenses += (travelledDistance * fuelPerKm);

            if (i % 3 == 0) {
                expenses += (expenses * 0.4);
            } else if (i % 5 == 0) {
                expenses += (expenses * 0.4);
            }
            if (i % 7 == 0) {
                expenses -= (expenses / group);
            }

            if (expenses > budget) {
                expenses = Math.abs(expenses - budget);
                System.out.printf("Not enough money to continue the trip. You need %.2f$ more.", expenses);
                return;
            }
        }

        expenses = budget - expenses;
        System.out.printf("You have reached the destination. You have %.2f$ budget left.", expenses);
    }
}
