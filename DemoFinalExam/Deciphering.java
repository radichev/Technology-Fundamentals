package TechModule.DemoFinalExam;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Deciphering {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String[] stringsToReplace = scanner.nextLine().split("\\s+");

        String regex = "^[d-z{}\\|#]+$";

        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher(input);
        StringBuilder result = new StringBuilder();
        if (matcher.find()) {
            for (int i = 0; i < input.length(); i++) {
                int asd = input.charAt(i) - 3;
                result.append((char) asd);
            }
            String finalString = result.toString().replaceAll(stringsToReplace[0], stringsToReplace[1]);
            System.out.println(finalString);
        } else {
            System.out.println("This is not the book you are looking for.");
        }
    }
}
