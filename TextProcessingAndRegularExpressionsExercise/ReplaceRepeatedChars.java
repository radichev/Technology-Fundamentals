package TechModule.TextProcessingAndRegularExpressionsExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ReplaceRepeatedChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> str = Arrays.stream(scanner.nextLine().split(""))
                .collect(Collectors.toList());

        for (int i = 0; i < str.size() - 1; i++) {
            if (str.get(i).equals(str.get(i + 1))) {
                if (i + 1 > str.size() - 1) {
                    break;
                }
                str.remove(i);
                i--;
            }
        }
        str.forEach(System.out::print);
    }
}
