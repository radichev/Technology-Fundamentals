package TechModule.TextProcessingAndRegularExpressionsExercise;

import java.util.Scanner;

public class CharacterMultiplayer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        int index = input.indexOf(" ");
        String firstWord = input.substring(0, index);
        String secondWord = input.substring(index + 1);
        int sum = 0;

        if (firstWord.length() > secondWord.length()) {
            for (int i = 0; i < secondWord.length(); i++) {
                sum += secondWord.charAt(i) * firstWord.charAt(i);
            }
            for (int i = secondWord.length(); i < firstWord.length(); i++) {
                sum += firstWord.charAt(i);
            }
        } else {
            for (int i = 0; i < firstWord.length(); i++) {
                sum += secondWord.charAt(i) * firstWord.charAt(i);
            }
            for (int i = firstWord.length(); i < secondWord.length(); i++) {
                sum += secondWord.charAt(i);
            }
        }
        System.out.println(sum);
    }
}
