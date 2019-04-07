package TechModule.TechExams;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class QuestsJournal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> journal =
                Arrays.stream(scanner.nextLine().split(", "))
                        .collect(Collectors.toList());

        while (true) {
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("Retire!")) {
                break;
            }

            String[] command = input.split(" -+ ");

            if (command[0].equalsIgnoreCase("Start")) {
                if (journal.contains(command[1])) {
                    continue;
                } else {
                    journal.add(command[1]);
                }
            }
            if (command[0].equalsIgnoreCase("Complete")) {
                journal.remove(command[1]);
            }
            if (command[0].equalsIgnoreCase("Side Quest")) {
                String[] sidequest = command[1].split(":+");
                if (journal.contains(sidequest[0])) {
                    if (journal.contains(sidequest[1])) {
                        continue;
                    } else {
                        int sideIndex = journal.indexOf(sidequest[0]);
                        journal.add(sideIndex+1, sidequest[1]);
                    }
                }
            }
            if (command[0].equalsIgnoreCase("Renew")) {
                if (journal.contains(command[1])) {
                    journal.remove(command[1]);
                    journal.add(command[1]);
                }
            }
        }
        for (int i = 0; i < journal.size(); i++) {
            if (i == journal.size() - 1) {
                System.out.print(journal.get(i));
            } else {
                System.out.print(journal.get(i) + ", ");
            }
        }
    }
}
