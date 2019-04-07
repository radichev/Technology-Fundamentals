package TechModule.ArraysExcersice;

import java.util.Arrays;
import java.util.Scanner;

public class LadyBugs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = Integer.parseInt(scanner.nextLine());

        int[] field = new int[size];

        String[] bug = scanner.nextLine().split(" ");

        int[] bugPosition = new int[bug.length];

        for (int i = 0; i < bug.length; i++) {
            bugPosition[i] = Integer.parseInt(bug[i]);
        }

        for (int i = 0; i < bugPosition.length; i++) {
            if (bugPosition[i] >= 0 && bugPosition[i] < field.length) {
                field[bugPosition[i]] = 1;
            }
        }

        while (true) {
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("end")) {
                break;
            }

            String[] command = input.split(" ");

            int endIndex = Integer.parseInt(command[2]);
            int startIndex = Integer.parseInt(command[0]);

            if (startIndex < 0 || startIndex >= field.length || field[startIndex] == 0) {
                continue;
            }

            field[startIndex] = 0;

            int currentFlight = endIndex;


            switch (command[1]) {
                case "right":
                    while (startIndex + currentFlight < field.length && startIndex + currentFlight >= 0) {
                        {
                            if (field[startIndex + currentFlight] == 0) {
                                field[startIndex + currentFlight] = 1;
                                break;
                            } else {
                                currentFlight += endIndex;
                            }
                        }
                    }

                    break;
                case "left":
                    while (startIndex - currentFlight >= 0 && startIndex - currentFlight < field.length) {
                        if (field[startIndex - currentFlight] == 0) {
                            field[startIndex - currentFlight] = 1;
                            break;
                        } else {
                            currentFlight += endIndex;
                        }
                    }
            }
        }
        System.out.println(Arrays.toString(field).replaceAll("[\\[,\\]]", ""));
    }
}
