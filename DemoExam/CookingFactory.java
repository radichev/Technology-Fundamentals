package TechModule.DemoExam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CookingFactory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        int bestSum = Integer.MIN_VALUE;
        double bestAverage = 0;
        int bestLength = Integer.MAX_VALUE;
        List<Integer> bestAnswer = new ArrayList<>();

        while(!"Bake It!".equals(command)) {
            int[] splitTheCommand = Arrays.stream(command.split("#")).mapToInt(Integer::parseInt).toArray();

            int sum = 0;
            for (int item : splitTheCommand) {
                sum += item;
            }

            int lenght = splitTheCommand.length;
            double average = (double)sum / lenght;

            if (sum > bestSum) {
                bestAnswer.clear();
                bestSum = sum;
                bestAverage = average;
                bestLength = lenght;
                for (int item : splitTheCommand) {
                    bestAnswer.add(item);
                }
            } else if (average > bestAverage && sum == bestSum) {
                bestAnswer.clear();
                bestAverage = average;
                bestLength = lenght;
                for (int item : splitTheCommand) {
                    bestAnswer.add(item);
                }
            } else if (lenght < bestLength && sum == bestSum && average == bestAverage) {
                bestAnswer.clear();
                bestLength = lenght;
                for (int item : splitTheCommand) {
                    bestAnswer.add(item);
                }
            }
            command = scanner.nextLine();
        }

        System.out.printf("Best Batch quality: %d%n", bestSum);
        for (Integer item : bestAnswer) {
            System.out.print(item + " ");
        }
    }
}