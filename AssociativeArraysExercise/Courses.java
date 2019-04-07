package TechModule.AssociativeArraysExercise;

import java.util.*;

public class Courses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedHashMap<String, List<String>> course = new LinkedHashMap<>();

        while (true) {
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("end")) {
                break;
            }

            String[] command = input.split(" : ");

            String nextCourse = command[0];
            String student = command[1];

            if (!course.containsKey(nextCourse)) {
                course.put(nextCourse, new ArrayList<>());
                course.get(nextCourse).add(student);
            } else {
                course.get(nextCourse).add(student);
                Collections.sort(course.get(nextCourse));
            }
        }
        course.entrySet().stream().sorted((left, right) -> Integer.compare(right.getValue().size(), left.getValue().size()))
                .forEach(entry -> {
                    System.out.printf("%s: %d%n", entry.getKey(), entry.getValue().size());
                    for (int i = 0; i < entry.getValue().size(); i++) {
                        System.out.println("-- " + entry.getValue().get(i));
                    }
                });
    }
}
