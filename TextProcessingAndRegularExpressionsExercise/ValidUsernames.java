package TechModule.TextProcessingAndRegularExpressionsExercise;

import java.util.Scanner;

public class ValidUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] names = scanner.nextLine().split(", ");

        for (String word : names) {
            if (validateUsername(word)) {
                System.out.println(word);
            }
        }

    }

    private static boolean validateUsername(String word) {
        if (word.length() < 3 || word.length() > 16) {
            return false;
        }
        String validate = "-_";
        for (int i = 0; i < word.length(); i++) {
            if (!Character.isLetterOrDigit(word.charAt(i)) && word.charAt(i) != '-' && word.charAt(i) != '_') {
                return false;
            }
        }
        return true;
    }
}
