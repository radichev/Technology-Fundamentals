package TechModule.MethodsAndFunctionsExcersice;

import java.util.Scanner;

public class AddAndSubstract {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());
        int thirdNum = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        System.out.println(subtract(thirdNum , sum(firstNum, secondNum)));

    }
    static int sum(int first, int second) {
        first = first + second;
        return first;
    }

    static int subtract (int third, int first) {
        first = first - third;
        return first;
    }
}
