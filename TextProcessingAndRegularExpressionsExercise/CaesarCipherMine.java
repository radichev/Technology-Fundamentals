package TechModule.TextProcessingAndRegularExpressionsExercise;

import java.util.Scanner;

public class CaesarCipherMine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String result = scanner.nextLine();

        for (int i = 0; i < result.length(); i++) {
            int asd = result.charAt(i) + 3;
            System.out.print((char) asd);
        }
    }
}
