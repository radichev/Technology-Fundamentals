package TechModule.TechExams;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ChatLogger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> chat = new ArrayList<>();

        while (true) {
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("end")) {
                break;
            }

            String[] commands = input.split("\\s+");

            if (commands[0].equalsIgnoreCase("chat")) {
                chat.add(commands[1]);
            }
            if (commands[0].equalsIgnoreCase("delete")) {
                chat.remove(commands[1]);
            }
            if (commands[0].equalsIgnoreCase("edit")) {
                int editIndex = chat.indexOf(commands[1]);
                chat.set(editIndex, commands[2]);
            }
            if (commands[0].equalsIgnoreCase("pin")) {
                chat.remove(commands[1]);
                chat.add(commands[1]);
            }
            if (commands[0].equalsIgnoreCase("spam")) {
                for (int i = 1; i < commands.length; i++) {
                    chat.add(commands[i]);
                }
            }
        }
        for (int i = 0; i < chat.size(); i++) {
            System.out.println(chat.get(i));
        }
    }
}
