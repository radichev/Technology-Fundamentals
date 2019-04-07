package TechModule.Arrays;

import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfDays = Integer.parseInt(scanner.nextLine());

        String[] daysAsString = {
                "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"
        };

        if (numberOfDays <= 0 || numberOfDays > 7) {
            System.out.println("Invalid day!");
        } else {
            System.out.println(daysAsString[numberOfDays - 1]);
        }
    }
}
