package TechModule.TechArchiveFinalExams;

import java.util.*;

public class Concert {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedHashMap<String, List<String>> bands = new LinkedHashMap<>();
        TreeMap<String, Integer> playtime = new TreeMap<>();

        int totalTime = 0;

        while (true) {
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("start of concert")) {
                break;
            }

            String[] command = input.split(";\\s+");

            if (command[0].equalsIgnoreCase("Add")) {

                String[] nextCommand = input.split(";\\s+|,\\s+");

                if (!bands.containsKey(nextCommand[1])) {
                    bands.put(nextCommand[1], new ArrayList<>());
                }
                for (int j = 2; j < nextCommand.length; j++) {
                    if (!bands.get(nextCommand[1]).contains(nextCommand[j])) {
                        bands.get(nextCommand[1]).add(nextCommand[j]);
                    }
                }
            }
            if (command[0].equalsIgnoreCase("Play")) {
                if (!playtime.containsKey(command[1])) {
                    playtime.put(command[1], Integer.parseInt(command[2]));
                    totalTime += Integer.parseInt(command[2]);
                } else {
                    playtime.put(command[1], playtime.get(command[1]) + Integer.parseInt(command[2]));
                    totalTime += Integer.parseInt(command[2]);
                }
            }
        }
        System.out.printf("Total time: %d%n", totalTime);
        playtime.entrySet()
                .stream()
                .sorted((e1, e2) -> {
                    int sort = Integer.compare(e2.getValue(), e1.getValue());
                    // Not Needed because of TreeMap
                    if (sort == 0) {
                        sort = e1.getKey().compareTo(e2.getKey());
                    }
                    return sort;
                }).forEach(x -> System.out.printf("%s -> %d%n", x.getKey(), x.getValue()));
        String lastInput = scanner.nextLine();

        System.out.println(lastInput);

        bands.entrySet()
                .stream()
                .filter(e -> e.getKey().equals(lastInput))
                .forEach(x -> {
                    for (int i = 0; i < x.getValue().size(); i++) {
                        System.out.printf("=> %s%n", x.getValue().get(i));
                    }
                });

    }
}
