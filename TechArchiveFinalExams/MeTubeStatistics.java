package TechModule.TechArchiveFinalExams;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class MeTubeStatistics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedHashMap<String, Integer> videoViews = new LinkedHashMap<>();
        LinkedHashMap<String, Integer> likesVideo = new LinkedHashMap<>();

        while (true) {
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("stats time")) {
                break;
            }

            if (input.contains("-")) {
                String[] command = input.split("\\-");
                String name = command[0];
                int views = Integer.parseInt(command[1]);

                if (!videoViews.containsKey(name)) {
                    videoViews.put(name, views);
                    likesVideo.put(name, 0);
                } else {
                    videoViews.put(name, videoViews.get(name) + views);
                }
            }
            if (input.contains(":")) {
                String[] command = input.split("\\:");
                String like = command[0];
                String name = command[1];

                if (videoViews.containsKey(name) && !likesVideo.containsKey(name)) {
                    if (like.equalsIgnoreCase("like")) {
                        likesVideo.put(name, 1);
                    } else {
                        likesVideo.put(name, 0);
                    }
                } else if (videoViews.containsKey(name)) {
                    if (like.equalsIgnoreCase("like")) {
                        likesVideo.put(name, likesVideo.get(name) + 1);
                    } else {
                        likesVideo.put(name, likesVideo.get(name) - 1);
                    }
                }
            }
        }
        String order = scanner.nextLine();

        if (order.equalsIgnoreCase("by likes")) {
            likesVideo.entrySet()
                    .stream()
                    .sorted((e1, e2) -> Integer.compare(e2.getValue(), e1.getValue()))
                    .forEach(x -> System.out.printf("%s - %d views - %d likes%n", x.getKey(), videoViews.get(x.getKey()), x.getValue()));
        } else {
            videoViews.entrySet()
                    .stream()
                    .sorted((e1, e2) -> Integer.compare(e2.getValue(), e1.getValue()))
                    .forEach(x -> System.out.printf("%s - %d views - %d likes%n", x.getKey(), x.getValue(), likesVideo.get(x.getKey())));
        }
    }
}
