package TechModule.TechArchiveFinalExams;

import java.util.*;

public class SantasNewList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        TreeMap<String, Integer> presentCount = new TreeMap<>();
        LinkedHashMap<String, Integer> countOfPresents = new LinkedHashMap<>();

        List<String> remove = new ArrayList<>();

        while (true) {
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("end")) {
                break;
            }

            String[] command = input.split("->");

            if (command[0].equalsIgnoreCase("Remove")) {
                remove.add(command[1]);
                continue;
            }

            String name = command[0];
            String present = command[1];
            int amount = Integer.parseInt(command[2]);

            if (!presentCount.containsKey(name)) {
                presentCount.put(name, amount);
            } else {
                presentCount.put(name, presentCount.get(name) + amount);
            }
            if (!countOfPresents.containsKey(present)) {
                countOfPresents.put(present, amount);
            } else {
                countOfPresents.put(present, countOfPresents.get(present) + amount);
            }

        }
        System.out.printf("Children:%n");

        if (remove.size() > 0) {
            presentCount.entrySet()
                    .stream()
                    .filter(x -> !remove.contains(x.getKey()))
                    .sorted((e1, e2) -> Integer.compare(e2.getValue(), e1.getValue()))
                    .forEach(p -> System.out.printf("%s -> %d%n", p.getKey(), p.getValue()));
        } else {
            presentCount.entrySet()
                    .stream()
                    .sorted((e1, e2) -> Integer.compare(e2.getValue(), e1.getValue()))
                    .forEach(p -> System.out.printf("%s -> %d%n", p.getKey(), p.getValue()));
        }

        System.out.printf("Presents:%n");

        countOfPresents.forEach((key, value) -> System.out.printf("%s -> %d%n", key, value));
    }
}
