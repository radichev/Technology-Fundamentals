package TechModule.TechArchiveFinalExams;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SongEncryption {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String artistRegex = "^[A-Z][a-z\\'\\s]+\\:[A-Z\\s]+$";

        while (true) {
            String input = scanner.nextLine();
            StringBuilder result = new StringBuilder();

            if (input.equalsIgnoreCase("end")) {
                break;
            }

            String[] command = input.split(":");

            Pattern artistPattern = Pattern.compile(artistRegex);

            Matcher artistMatcher = artistPattern.matcher(input);

            if (artistMatcher.find()) {
                int keyLenght = command[0].length();

                String edit = input.replace(":", "@");


                for (int i = 0; i < edit.length(); i++) {
                    int middleIndex = edit.indexOf("@");
                    if (i > middleIndex || i == 0) {
                        if ((edit.charAt(i) + keyLenght) > 90) {
                            int start = 90 - edit.charAt(i);
                            int next = keyLenght - start - 1;
                            char last = (char) (65 + next);
                            result.append(last);
                            continue;
                        }
                    }
                    if (i > 0 && i < middleIndex) {
                        if ((edit.charAt(i) + keyLenght) > 122) {
                            int start = 122 - edit.charAt(i);
                            int next = keyLenght - start - 1;
                            char last = (char) (97 + next);
                            result.append(last);
                            continue;
                        }
                    }
                    if (edit.charAt(i) == '@') {
                        result.append("@");
                        continue;
                    } else if (edit.charAt(i) == ' ') {
                        result.append(" ");
                        continue;
                    } else if (edit.charAt(i) == '\'') {
                        result.append("'");
                        continue;
                    }

                    char index = (char) (edit.charAt(i) + keyLenght);
                    result.append(index);
                }
                System.out.printf("Successful encryption: %s%n", result);
            } else {
                System.out.println("Invalid input!");
            }
        }
    }
}
