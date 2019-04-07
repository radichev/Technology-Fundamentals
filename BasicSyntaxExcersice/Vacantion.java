package TechModule.BasicSyntaxExcersice;

import java.util.Scanner;

public class Vacantion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numStudents = Integer.parseInt(scanner.nextLine());
        String type = scanner.nextLine();
        String day = scanner.nextLine();
        double price = 0;
        double discount = 0;

        if (type.equalsIgnoreCase("Business") && numStudents >= 100) {
            numStudents -= 10;
        }

        if (day.equalsIgnoreCase("Friday")) {
            if (type.equalsIgnoreCase("Students")) {
                price = numStudents * 8.45;
            } else if (type.equalsIgnoreCase("Business")) {
                price = numStudents * 10.90;
            } else if (type.equalsIgnoreCase("Regular")) {
                price = numStudents * 15;
            }
        } else if (day.equalsIgnoreCase("Saturday")) {
            if (type.equalsIgnoreCase("Students")) {
                price = numStudents * 9.80;
            } else if (type.equalsIgnoreCase("Business")) {
                price = numStudents * 15.60;
            } else if (type.equalsIgnoreCase("Regular")) {
                price = numStudents * 20;
            }
        } else if (day.equalsIgnoreCase("Sunday")) {
            if (type.equalsIgnoreCase("Students")) {
                price = numStudents * 10.46;
            } else if (type.equalsIgnoreCase("Business")) {
                price = numStudents * 16;
            } else if (type.equalsIgnoreCase("Regular")) {
                price = numStudents * 22.50;
            }
        }

        if (type.equalsIgnoreCase("Students") && numStudents >= 30) {
            price -= price * 0.15;
            System.out.printf("Total price: %.2f", price);
        } else if (type.equalsIgnoreCase("Regular") && numStudents >= 10 && numStudents <= 20) {
            price -= price * 0.05;
            System.out.printf("Total price: %.2f", price);
        } else {
            System.out.printf("Total price: %.2f", price);
        }
    }
}
