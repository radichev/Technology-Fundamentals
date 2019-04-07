package TechModule.ListsAndArraysAdvancedExcersice;

import java.util.ArrayList;
import java.util.Scanner;

public class Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputData = scanner.nextLine().split("\\s+");

        ArrayList<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < inputData.length; i++) {
            numbers.add(Integer.parseInt(inputData[i]));
        }

        int maxCapacity = Integer.parseInt(scanner.nextLine());

        String input = scanner.nextLine();

        while (!"end".equalsIgnoreCase(input)) {
            String[] data = input.split(" ");

            if (data.length == 2) {
                numbers.add(Integer.parseInt(data[1]));
            } else {
                int number = Integer.parseInt(data[0]);

                for (int i = 0; i < numbers.size(); i++) {
                    int currentElement = numbers.get(i);

                    if (currentElement + number <= maxCapacity) {
                        numbers.set(i, currentElement + number);
                        break;
                    }
                }
            }
            input = scanner.nextLine();
        }
        System.out.println(numbers.toString().replaceAll("[\\[,\\]]", ""));
    }
}
