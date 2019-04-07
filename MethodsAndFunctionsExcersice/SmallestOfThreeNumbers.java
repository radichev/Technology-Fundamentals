package TechModule.MethodsAndFunctionsExcersice;

import java.util.Scanner;

public class SmallestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());
        int thirdNumber = Integer.parseInt(scanner.nextLine());

        int minElement = min(firstNumber, secondNumber);
        System.out.println(Math.min(minElement, thirdNumber));
    }

    static int min(int first, int second) {
        return Math.min(first, second);
    }

}
