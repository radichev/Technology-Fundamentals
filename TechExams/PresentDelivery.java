package TechModule.TechExams;

import java.util.Scanner;

public class PresentDelivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputField = scanner.nextLine().split("@");

        int[] field = new int[inputField.length];

        for (int i = 0; i < inputField.length; i++) {
            field[i] = Integer.parseInt(inputField[i]);
        }

        int santaIndex = 0;
        int failedHouses = 0;

        while (true) {
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("Merry Xmas!")) {
                break;
            }

            String[] command = input.split(" ");

            int lenght = Integer.parseInt(command[1]);

            if (command[0].equalsIgnoreCase("Jump")) {

                if (santaIndex + lenght >= field.length) {
                    santaIndex = (santaIndex + lenght) % field.length;
                } else {
                    santaIndex += lenght;
                }

                if (field[santaIndex] == 0) {
                    System.out.printf("House %d will have a Merry Christmas.%n", santaIndex);
                } else {
                    field[santaIndex] -= 2;
                }
            }
        }

        System.out.printf("Santa's last position was %d.%n", santaIndex);

        for (int i = 0; i < field.length; i++) {
            if (field[i] > 0) {
                failedHouses++;
            }
        }
        if (failedHouses > 0) {
            System.out.printf("Santa has failed %d houses.", failedHouses);
        } else {
            System.out.println("Mission was successful.");
        }

    }
}
