package TechModule.MethodsAndFunctionsExcersice;

import java.util.Scanner;

public class CharactersInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //a
        //d
        char firstChar = scanner.nextLine().charAt(0);
        char secondChar = scanner.nextLine().charAt(0);

        char minElement = lowerNum(firstChar, secondChar);

        if (minElement == firstChar) {
            numBetween(firstChar, secondChar);
        } else {
            numBetween(secondChar, firstChar);
        }
    }

    static char lowerNum(char first, char second) {
        return (char) Math.min(first, second);
    }

    static void numBetween(char first, char second) {
        for (int i = first + 1; i < second; i++) {
            System.out.print((char) i + " ");
        }
    }

}
