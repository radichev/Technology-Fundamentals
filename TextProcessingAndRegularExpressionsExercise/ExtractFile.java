package TechModule.TextProcessingAndRegularExpressionsExercise;

import java.util.Scanner;

public class ExtractFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        int firstIndex = text.lastIndexOf('\\');
        int secondIndex = text.lastIndexOf('.');
        String first = text.substring(firstIndex + 1, secondIndex);
        String second = text.substring(secondIndex + 1);

        System.out.printf("File name: %s%n" +
                "File extension: %s", first, second);
    }
}
