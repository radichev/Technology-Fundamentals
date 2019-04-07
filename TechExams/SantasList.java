package TechModule.TechExams;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SantasList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> names =
                Arrays.stream(scanner.nextLine().split("&"))
                        .collect(Collectors.toList());

        while (true) {
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("Finished!")) {
                break;
            }

            String[] command = input.split(" ");

            if (command[0].equalsIgnoreCase("bad")) {
                if (names.contains(command[1])) {
                    continue;
                } else {
                    names.add(0, command[1]);
                }
            }
            if (command[0].equalsIgnoreCase("Good")) {
                names.remove(command[1]);
            }
            if (command[0].equalsIgnoreCase("rename")) {
                if (names.contains(command[1])) {
                    int index = names.indexOf(command[1]);
                    names.set(index, command[2]);
                }
            }

            if (command[0].equalsIgnoreCase("rearrange")) {
                if (names.contains(command[1])) {
                    names.remove(command[1]);
                    names.add(command[1]);
                }
            }
        }
        for (int i = 0; i < names.size(); i++) {
            if (i == names.size() - 1) {
                System.out.println(names.get(i));
            } else {
                System.out.print(names.get(i) + ", ");
            }
        }
    }
}


