package TechModule.TechArchiveFinalExams;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ActivationKeys {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String[] keys = input.split("&");

        String regex = "^[a-zA-Z\\d]+$";

        Pattern pattern = Pattern.compile(regex);

        StringBuilder result = new StringBuilder();
        int count = -1;

        for (String key : keys) {
            if (key.length() == 16) {
                Matcher matcher = pattern.matcher(key);
                if (matcher.find()) {
                    for (int j = 0; j < key.length(); j++) {
                        count++;
                        if (count == 4) {
                            result.append("-");
                            count = -1;
                            j--;
                            continue;
                        }
                        if (Character.isDigit(key.charAt(j))) {
                            int value = Character.getNumericValue(key.charAt(j));
                            int res = Math.abs(value - 9);
                            result.append(res);
                        } else {
                            result.append(key.charAt(j));
                        }
                    }
                    count = -1;
                    result.append(", ");
                }
            }
            if (key.length() == 25) {
                Matcher matcher = pattern.matcher(key);
                if (matcher.find()) {
                    for (int j = 0; j < key.length(); j++) {
                        count++;
                        if (count == 5) {
                            result.append("-");
                            count = -1;
                            j--;
                            continue;
                        }
                        if (Character.isDigit(key.charAt(j))) {
                            int value = Character.getNumericValue(key.charAt(j));
                            int res = Math.abs(value - 9);
                            result.append(res);
                        } else {
                            result.append(key.charAt(j));
                        }
                    }
                    count = -1;
                    result.append(", ");

                }
            }
        }
        int lastIndex = result.lastIndexOf(",");
        result.delete(lastIndex, lastIndex + 1);
        String finalResult = String.valueOf(result).toUpperCase();
        System.out.println(finalResult);
    }
}