package TechModule.MethodsAndFunctionsExcersice;

import java.util.Scanner;

public class PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        if (!enoughChars(input)) {
            System.out.println("Password must be between 6 and 10 characters");
        }
        if (!letterDigits(input)) {
            System.out.println("Password must consist only of letters and digits");
        }
        if (!twoDigits(input)) {
            System.out.println("Password must have at least 2 digits");
        }

        if (enoughChars(input) && letterDigits(input) && twoDigits(input)) {
            System.out.println("Password is valid");
        }
//        System.out.println(enoughChars(input));
//        System.out.println(letterDigits(input));
//        System.out.println(twoDigits(input));

    }

    static boolean enoughChars(String input) {

        boolean isCharacter = false;
        int count = 0;
        for (int i = 1; i <= input.length(); i++) {
            count++;
        }

        if (count >= 6 && count <= 10) {
            isCharacter = true;
            return isCharacter;
        }
        return isCharacter;

    }

    static boolean letterDigits(String input) {
        boolean isCharNum = false;
        char demo = input.charAt(0);
        for (int i = 0; i < input.length(); i++) {
            isCharNum = Character.isLetterOrDigit(demo);
            demo = input.charAt(i);

        }
        if (isCharNum) {
            return isCharNum;
        }
        return isCharNum;
    }

    static boolean twoDigits(String input) {
        boolean isCharNum = false;
        char demo = input.charAt(0);
        for (int i = 0; i < input.length(); i++) {

            isCharNum = Character.isDigit(demo);
            demo = input.charAt(i);
            if (i >= 1 && isCharNum) {
                return isCharNum;
            }
        }

        return isCharNum;
    }

}


