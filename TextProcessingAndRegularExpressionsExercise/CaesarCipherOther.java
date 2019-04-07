package TechModule.TextProcessingAndRegularExpressionsExercise;

import java.util.Scanner;

public class CaesarCipherOther {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        for (char c : input.toCharArray()) {
            System.out.print((char)(c+3));
        }
    }
}
